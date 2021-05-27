package week1.day1.Assignment;

public class FibnacciSeries {

	public static void main(String[] args) {
		//0,1,1,2,3,5,8,13... adding pervious two numbers
		
		int firstNum  = 0;
		int secondNum = 1;
	
		int thirdNum = 0;
				
		for (int i = 1; i <= 8; i++) {
			
		thirdNum = firstNum + secondNum;	
		
		System.out.println("print sum : " + thirdNum);
			
		firstNum = secondNum;
		secondNum = thirdNum;
		}
		
	}

}
