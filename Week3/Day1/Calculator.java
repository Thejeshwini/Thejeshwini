package week3.day1.classroom;

public class Calculator {
	//this is an example of method overloading: methods have same name but diff arguments
	public void add(int num1, int num2) {
		int sum = num1 +num2;
		System.out.println("sum of two int : " +sum);
	}

	public void add(int num1, int num2,int num3) {
		int sum1 = num1 +num2+ num3 ;
		System.out.println("sum of three ints : "+ sum1);
	}
	
	public void multiply(int num1, int num2) {
		int mul = num1 * num2;
		System.out.println("mul of two int " +mul);
	}
	
	public void multiply(int num1, double num2) {
		double mul1 = num1 * num2;
		System.out.println("mul of int and double "+mul1);
	}
	
	public void subtract(int num1, int num2) {
	//	return num1-num2;
		int sub = num1 -num2;
		System.out.println("subtract of two int "+sub);
	}
	
	public void subtract(double num1, double num2) {
		double sub1 = num1 -num2;
		System.out.println("subtarcting two double " + sub1);
	}
	
	public void divide(int num1, int num2) {
		int div = num1/num2;
		System.out.println("dividing two int " + div);
	}
	
	public void divide(double num1, int num2) {
	double div1 = num1/num2;
	System.out.println(" divinding double and int "+div1);
    }
	

public static void main(String[] args) {
	
	Calculator myCalcu = new Calculator();
		
		   myCalcu.add(10, 20); myCalcu.add(10, 40, 30);
		  
		  myCalcu.multiply(30, 20.1); myCalcu.multiply(50, 78);
		  
		  myCalcu.subtract(4, 2); myCalcu.subtract(2.34, 8.9);
		  
		  myCalcu.divide(233, 89); myCalcu.divide(98.5, 70);
		 
	
}
}
