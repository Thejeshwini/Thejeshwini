package week1.day2.Assignment;

public class SumOfDigitsString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum = 0;

		String replaceall = text.replaceAll("\\D", "");
		System.out.println("displaying only digits  " + replaceall);
		
		//converting to array
		char[] convchr = replaceall.toCharArray();	
		
		for (char c : convchr) {
			System.out.println("coverting to arry o/p   "+c);
			
		//	changing from char to int
			int textint = Character.getNumericValue(c);
			
			while(textint >0) {
        		int rem = textint %10 ;
        		sum = sum +rem;        			       		  
        	textint = textint /10 ;  
        		// System.out.println("sum of numbers is " + sum);	
       	}
		}
		System.out.println("sum of numbers is " + sum);	
        	
        	
        }
       	
	}


