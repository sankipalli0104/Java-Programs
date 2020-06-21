Steps to follow 📜

1. Fork it 🍴

You can get your own fork/copy of <your repo> by using the Fork button.

Fork Button

2. Clone it 👥

You need to go to your Fork of the Repository and then clone (download) it to local machine using

$ git clone https://github.com/<your username>/<your repo name>.git

This makes a local copy of repository in your machine.

Once you have cloned the Object_Oriented_Programming repository in Github, move to that folder first using change directory command on linux and Mac.

# This will change directory to a folder Object_Oriented_Programming                                                                   
$ cd Object_Oriented_Programming
Move to this folder for all other commands.

Now, lets add a reference to the original Object_Oriented_Programming repository using

$ git remote add upstream https://github.com/theabhishek07/Object_Oriented_Programming.git

This adds a new remote named upstream.

See the changes using

 $ git remote -v
 origin https://github.com/Your_Username/Object_Oriented_Programming.git (fetch)                                                      
 origin https://github.com/Your_Username/Object_Oriented_Programming.git (push)                                                        
 upstream https://github.com/theabhishek07/Object_Oriented_Programming.git (fetch)                                                     
 upstream https://github.com/theabhishek07/Object_Oriented_Programming.git (push)
3. Sync with the Remote 🔄

Always keep your local copy of repository updated with the original repository.

# Fetch all remote repositories and delete any deleted remote branches
	$ git fetch --all --prune
# Switch to master branch
	$ git checkout master
# Reset local master branch to match upstream repository's master branch
	$ git reset --hard upstream/master
# Push changes to your forked Object_Oriented_Programming repo
	$ git push origin master
4. Create a new branch ‼️

Whenever you are going to make a contribution. Please create a new branch using the command below and keep your master branch clean (i.e. synced with remote branch).

# It will create a new branch <branchname> with name and switch to branch <branchname>
	$ git checkout -b <branchname>
To switch to desired branch

# To switch from one folder to other
	$ git checkout <branchname>
To add the changes to the branch. Use

# To add all files to branch
	$ git add .
Type in a message relevant for the code reveiwer using

# This message get associated with all files you have changed
	$ git commit -m "relevant message"
Now, Push your awesome work to your remote repository using

# To push your work to your remote repository
	$ git push -u origin <branchname>
Finally, go to your repository in browser and click on compare and pull requests. Then add a title and description to your pull request that explains your precious effort.

#To check git Version:
	$ git —version
#To configure username and email	 associated with the git account.
	$ git config --global user.email <your email id>
	$ git config --global user.name <your username>
#Go to the folder/file.

 	$ git init 
	$ git status
#add some file 
	$ touch  <Filename>
	$ git add <filename>	
	$ git commit -m <Message>
#To Connect to remote Repository 
	$ git remote add origin <RepoURL>
#To push to origin branch :
	$ git push -u origin master 
 
#It will ask you for SSH Key 
	<https://docs.joyent.com/public-cloud/getting-started/ssh-keys/generating-an-ssh-key-manually/manually-generating-your-ssh-key-in-mac-os-x>
	$ ssh-keygen -t rsa
	don’t type use <enter>
	<enter>
	
git config
Usage: git config –global user.name “[name]”  

Usage: git config –global user.email “[email address]”  

This command sets the author name and email address respectively to be used with your commits.

Git Config Command - Git Commands - Edureka

git init
Usage: git init [repository name]

 

This command is used to start a new repository.

GitInit Command - Git Commands - Edureka

$ git clone
Usage: git clone [url]  

This command is used to obtain a repository from an existing URL.

Git Clone Command - Git Commands - Edureka

$ git add
Usage: git add [file]  

This command adds a file to the staging area.

Git Add Command - Git Commands - Edureka

Usage: git add *  

This command adds one or more to the staging area.

Git Add Command - Git Commands - Edureka

$ git commit
Usage: git commit -m “[ Type in the commit message]”  

This command records or snapshots the file permanently in the version history.

Git Commit Command - Git Commands - Edureka

Usage: git commit -a  

This command commits any files you’ve added with the git add command and also commits any files you’ve changed since then.

Git Commit Command - Git Commands - Edureka

$ git diff
Usage: git diff  

This command shows the file differences which are not yet staged.

Git Diff Command - Git Commands - Edureka

 Usage: git diff –staged 

This command shows the differences between the files in the staging area and the latest version present.

Git Diff Command - Git Commands - Edureka

Usage: 
$ git diff [first branch] [second branch]  

This command shows the differences between the two branches mentioned.

Git Diff Command - Git Commands - Edureka

$ git reset
Usage: git reset [file]  

This command unstages the file, but it preserves the file contents.

Git Reset Command - Git Commands - Edureka

Usage: git reset [commit]  

This command undoes all the commits after the specified commit and preserves the changes locally.

Git Reset Command - Git Commands - Edureka

Usage: git reset –hard [commit]  This command discards all history and goes back to the specified commit.

Git Reset Command - Git Commands - Edureka

$ git status
Usage: git status  

This command lists all the files that have to be committed.

Git Status Command - Git Commands - Edureka

$ git rm
Usage: git rm [file]  

This command deletes the file from your working directory and stages the deletion.

Git Rm Command - Git Commands - Edureka

git log
Usage: git log  

This command is used to list the version history for the current branch.

Git Log Command - Git Commands - Edureka

Usage: git log –follow[file]  

This command lists version history for a file, including the renaming of files also.

Git Log Command - Git Commands - Edureka

git show
Usage: git show [commit]  

This command shows the metadata and content changes of the specified commit.

Git Show Command - Git Commands - Edureka

git tag
Usage: git tag [commitID]  

This command is used to give tags to the specified commit.

Git Tag Command - Git Commands - Edureka

git branch
Usage: git branch  

This command lists all the local branches in the current repository.

Git Branch Command - Git Commands - Edureka

Usage: git branch [branch name]  

This command creates a new branch.

Git Branch Command - Git Commands - Edureka

Usage: git branch -d [branch name]  

This command deletes the feature branch.

Git Branch Command - Git Commands - Edureka

git checkout
Usage: git checkout [branch name]  

This command is used to switch from one branch to another.

Git Checkout Command - Git Commands - Edureka

Usage: git checkout -b [branch name]  

This command creates a new branch and also switches to it.

Git Checkout Command - Git Commands - Edureka

git merge
Usage: git merge [branch name]  

This command merges the specified branch’s history into the current branch.

Git Merge Command - Git Commands - Edureka

git remote
Usage: git remote add [variable name] [Remote Server Link]  

This command is used to connect your local repository to the remote server.

Git Remote Command - Git Commands - Edureka

git push
Usage: git push [variable name] master  

This command sends the committed changes of master branch to your remote repository.

Git Push Command - Git Commands - Edureka

Usage: git push [variable name] [branch]  

This command sends the branch commits to your remote repository.

Git Push Command - Git Commands - Edureka

Usage: git push –all [variable name]  

This command pushes all branches to your remote repository.

Git Push Command - Git Commands - Edureka

Usage: git push [variable name] :[branch name]  

This command deletes a branch on your remote repository.

Git Push Command - Git Commands - Edureka

git pull
Usage: git pull [Repository Link]  

This command fetches and merges changes on the remote server to your working directory.

Git Pull Command - Git Commands - Edureka

git stash
Usage: git stash save  

This command temporarily stores all the modified tracked files.

Git Stash Command - Git Commands - Edureka

Usage: git stash pop  

This command restores the most recently stashed files.

Git Stash Command - Git Commands - Edureka

Usage: git stash list  

This command lists all stashed changesets.

Git Stash Command - Git Commands - Edureka

Usage: git stash drop  

This command discards the most recently stashed changeset.

Git Stash Command - Git Commands - Edureka