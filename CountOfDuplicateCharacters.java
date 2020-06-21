public class CountOfDuplicateCharacters{
	public static void main(String ... str){
		String input ="abbccdeeffghhi";
		String withNoDuplicates= "";
		for(int i=0; i < input.length(); i++){
			char temp = input.charAt(i);
			if(!withNoDuplicates.contains(""+temp)){
				withNoDuplicates += temp;
			}
		}
		//System.out.println(withNoDuplicates);
		int count[] = new int[withNoDuplicates.length()];
		for(int j=0; j < withNoDuplicates.length(); j++){
			char temp = withNoDuplicates.charAt(j);
			int times = 0;
			for(int k= 0; k < input.length(); k++){
				if(temp == input.charAt(k)){
					times++;
				}
			}
			count[j] = times; 
		}
		for(int i= 0; i < count.length; i++){
			System.out.println("Number of "+withNoDuplicates.charAt(i)+"'s is "+count[i]);
		}
	}
}