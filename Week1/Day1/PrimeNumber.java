package week1.day1.Assignment;

public class PrimeNumber {
//prime number is divisible by 1 and its same number ex 13, 11, etc
	
	public static void main(String[] args) {
		
		int input = 13;
		int count = 0;
		
		for (int i = 1; i <= input; i++) {
			
			if(input % i ==0) {
				count = count +1 ; //increase the count ,when its succfuly divded so two times its increase i.e 1 and 13
			}	
		}
		
		if(count==2) {
			System.out.println("Given number is a prime number");
		}else {
			System.out.println("Given number is not a prime number");
		}
		
	}

}
