public class Pet {
	// keep track of the name, age, weight, type of animal, and breed of the pet
	// Write 2 constructors, accessor (get) methods, and a toString method. Use good commenting.
	// Don't forget to complete the main method in the TesterClass below!
   
   
	private String name;
	private int age;
	private double weight;
	private String typeOfPet;
	private String breedOfPet;
      
	public Pet(){
	}
	public Pet(String name,int age,  double weight, String typeOfPet, String breedOfPet){
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.typeOfPet = typeOfPet;
		this.breedOfPet = breedOfPet;	
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setAge(double weight){
		this.weight = weight;
	}
	public double getWeigth(){
		return weight;
	}
	public void setTypeOfpet(String typeOfPet){
		this.typeOfPet = typeOfPet;
	}
	public String getTypeOfPet(){
		return typeOfPet;
	}
	public void setBreedOfPet(String breedOfPet){
		this.breedOfPet = breedOfPet;
	}
	public String getBreedOfPet(){
		return breedOfPet;
	}
	public String toString(){
		return "pet details: "+name + ", " + age + ", " +weight + " ,"+typeOfPet +", "+breedOfPet ;
	}
}