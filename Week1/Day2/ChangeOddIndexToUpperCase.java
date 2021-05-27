package week1.day2.Assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		//prints output as index odd as uppercase.
		String test = "changename";
		
		char[] testnew = test.toCharArray();
		
	//	char[] testnew = new char[test.length()];	
		
		for(int i=0; i< test.length();i ++) {
		//	testnew[i] = test.charAt(i);
		//	System.out.println(testnew[i] + "-->" + i);	
			
			if(i % 2 == 1 ) {
			//	prints if the index is odd uppercase
				System.out.println(Character.toUpperCase(testnew[i]));
			}else
				//prints if the index is even lowercase
			{
				System.out.println(Character.toLowerCase(testnew[i]));
			}
			
		}	
	
}

}
