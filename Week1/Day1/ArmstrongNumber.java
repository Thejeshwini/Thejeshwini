package week1.day1.Assignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int	num = 153;
	//	int output = 1*1*1 + 5*5*5 + 3*3*3 ;
		int result =0 ;
		int remainder,original;
		
		original =num;
		
		while(original != 0) {
			remainder = original % 10;
			result = result + remainder*remainder*remainder;
			
			
			original = original/10;
					
		}
		if(result == num) {
			System.out.println(num + " armstrong number");
		}else {
			System.out.println(num + " not armstrong number");
		}
		
	}

}
