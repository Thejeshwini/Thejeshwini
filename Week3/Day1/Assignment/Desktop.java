package week3.day1.Assignment;

public class Desktop extends Computer{
	
	public void getDesktopModel() {
		System.out.println("Desktop model");
		
	}
	
	public static void main (String[]args) {
		Desktop myDesktop = new Desktop();
		myDesktop.getComputerModel();
		myDesktop.getDesktopModel();
	}
}
