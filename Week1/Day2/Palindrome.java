package week1.day2.Assignment;

public class Palindrome {

	public static void main(String[] args) {
		String input = "madam";
		String rev = "madam";
		
		for(int i=input.length()-1 ; i>=0; i--) {
		System.out.println(input.charAt(i));
	
		}
		if(input.equals(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		
	}

}
