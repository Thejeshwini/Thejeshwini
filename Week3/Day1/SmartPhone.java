package week3.day1.classroom;

public class SmartPhone extends AndriodPhone{
	
	public void connectWhatsup() {
		System.out.println("coonecting the whats up");
	}
	
	public void takeViedo() {
		System.out.println("taking viedo in Smartphone");
	}

	public static void main(String[]args) {
		SmartPhone mySmartPhone = new SmartPhone();
		mySmartPhone.takeViedo();
	}
}
