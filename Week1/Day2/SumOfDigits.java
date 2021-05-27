package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		int inputNumber = 123;
		int sum =0; // intilize sum with zero 0
		
		while(inputNumber >0) {
			
		int rem =	inputNumber % 10 ;
		sum = sum +rem ;
		  
		inputNumber = inputNumber /10 ;
			
		}
		System.out.println(sum);
		}
		
		
	}


