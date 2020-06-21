class Test1{
	public static void main(String ... str){
	// 	Y y = new Y(4);
// 		X x = new X(y);
// 		x.t = 5;		
// 		x.displya();
	// CharSequence ch = Test1.getMiddleChar("ab");
// 	System.out.println(ch);	
	Test1.display(8);
		
	}
	
	public static CharSequence getMiddleChar(CharSequence str){
			System.out.println(str.length());
			
			CharSequence ch = "";
		if(str.length() > 0){
		int leng = str.length()/2;
		System.out.println(leng);
			if(str.length()%2 != 0){
				System.out.println("if condition "+leng);
				char c = str.charAt(leng);
				ch = c +" ";
				return ch;
			} else {			
				System.out.println("Else condition"+leng);
				ch  =	str.subSequence(leng-1, leng+1);
				return 	ch;			
			}
		}
		return 	null;
	}
	
	public static void display(int day){
		String weekday = " ";
		switch(day){
			case 1: System.out.println("Sunday"); break;
			case 2: System.out.println("Monday"); break;
			case 3: System.out.println("Tuesday"); break;
			case 4: System.out.println("Wednesday"); break;
			case 5: System.out.println("Thurday"); break;
			case 6: System.out.println("Friday"); break;
			case 7: System.out.println("Saturday"); break;
			default: System.out.println("Not apllicable");
			
		}
	}
	
}