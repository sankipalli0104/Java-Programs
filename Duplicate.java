public class Duplicate{
	public static void main(String ... str){
		String input = "abbccdefghii";
		for(int i=0; i < input.length(); i++){
			char temp= input.charAt(i);
			int j = i+1; 
			boolean isTrue= false;
			while(j < input.length()){
				if(temp == input.charAt(j)){
					isTrue = true;
				}
				j++;
			}
			if(isTrue){
				System.out.print(temp+" ");
			}
		}
	}
}