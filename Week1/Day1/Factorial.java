package week1.day1.Assignment;

public class Factorial {
//facctorial is 1*2*3*4*5 = 120
	public static void main(String[] args) {
	int input = 5;
	
	//intial value of the result is 1 for multiply
	//intial value of the result is 0 for sum
	
	int fact = 1;
	
	for (int i = 1; i <= 5; i++) {
	
		fact = fact * i;
	
	//System.out.println("print output:" + fact);
	}
	System.out.println("print output:" + fact);
	}

}
