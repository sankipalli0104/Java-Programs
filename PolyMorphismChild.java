public class PolyMorphismChild extends PolyMorphismParent{
	public static int test1(int i) {
		System.out.println("Child test1 Method "+i);
		return 0;
	}
	public static void main(String ... args){
		PolyMorphismParent pm = new PolyMorphismChild();
		pm.test1(3);
		
	}
}