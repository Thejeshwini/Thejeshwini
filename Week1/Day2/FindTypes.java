package week1.day2.Assignment;

public class FindTypes {
	public static void main(String[] args) {
		//printing all the count of the letters,numbers,space,specialchar
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] testarry = new char[test.length()];
		
		for(int i =0 ; i < test.length() ; i++) {
			
			testarry[i] = test.charAt(i);		
		//	System.out.println(testarry[i]);
				
			if(Character.isLetter(testarry[i])) {
				letter = letter +1;			
			}
			else if(Character.isDigit(testarry[i])) {
				num = num +1;			
			}
		
			else if(Character.isSpaceChar(testarry[i])) {
				space = space +1;			
			}	
			else {
				specialChar = specialChar +1;			
			}
			}
		System.out.println("letter: " + letter);
		System.out.println("number: " + num);
		System.out.println("space: " + space);
		System.out.println("specialchar: " + specialChar);
		}

	}


