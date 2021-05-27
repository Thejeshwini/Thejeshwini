package week3.day1.Assignment;

public class AxisBank extends BankInfo {
	
	public void getDepositAccount() {
		System.out.println("Print Deposit account deatils from Axis");

	}
	
	public static void main(String[]args) {
		
		AxisBank myAxisBank = new AxisBank();
		
		//overriding the method deposit
		myAxisBank.getDepositAccount();
	}

}
