package week1.day2;

public class Calculator {

	public int getAdd(int num1, int num2, int num3) {
		
		int sum = num1 + num2 + num3;
		System.out.println(sum);
		return sum;
		
	}
	
	public int getSub(int num1, int num2) {
		
		int subtraction = num1 -num2 ;
		System.out.println(subtraction);
		return subtraction;
		
	}
	
	public double getMul(double num1, double num2) {
		
		double product = num1 * num2 ;
		System.out.println(product);
		return product;		

	}
	
	public float getDivide(float num1, float num2) {
		
		float division = num1 /num2 ;
		System.out.println(division);
		return division;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
