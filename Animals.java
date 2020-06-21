import com.siva.apple.Human;

public class Animals {

	public static void main(String ... str){
		
		// Human human = new Human();
// 		human.CallMethod("Men");
		String type = str[0];
		Human human = new Human();
		if(type.matches("Men")){
			Human.Men men = new Human.Men("Siva", 26);
			men.displayMenDetails();
			System.out.println(human.displayDetails());
		} else if(type.matches("Women")){
			Human.Women women = human.new Women("mani", 25);
			women.displayWomenDetails();
			System.out.println(human.displayDetails());
		} else {
			System.out.println("Invalid type");
		}
		
	}

}