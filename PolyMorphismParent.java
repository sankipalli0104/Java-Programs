public class PolyMorphismParent {
	public void test1() {
		System.out.println("Test One Method");
	}
	public static int test1(int i) {
		System.out.println("Parent test1 Method "+i);
		return 0;
	}
// 	public static void main(String ... args){
// 		PolyMorphismParent pm = new PolyMorphismParent();
// 		int i = pm.test1(2);
// 		System.out.println("Test two Method "+i);
// 	}
// PolyMorphismChild.java:2: error: test1(int) in PolyMorphismChild cannot override test1(int) in PolyMorphismParent
// 	public int test1(int i) {
// 	           ^
//   overridden method is static
// 1 error


}