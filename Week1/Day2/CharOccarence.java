package week1.day2.Assignment;

public class CharOccarence {
// counting the number of char 'e'
	
	public void method1() {
		String str = "welcome to chennai";
		char somechar = 'e' ;
		int count = 0;
		
		// Creating array of string length
		char[] strarray =new char[str.length()];
		
        // Copy character by character into array
        for (int i = 0; i < str.length(); i++) {
        	
        //	strarray[i] = str.charAt(i);
        	
        	if(str.charAt(i) == somechar) {
        		count = count +1;        		
        	}
        }
        	
		System.out.println("total count is "+count);

	}
	
	public void method2() {
		
		String str = "welcome to chennai";
		int count = 0;
		
		char[] chstr = str.toCharArray();
		
		for (int i = 0; i < chstr.length; i++) {
			if(str.charAt(i) == 'e') {
				count = count+1;
			}
		}
		System.out.println("total count is "+count);
	}
	
	
	public static void main(String[] args) {
		CharOccarence strobj = new CharOccarence();
		strobj.method1();
	//	strobj.method2();
	}

}
