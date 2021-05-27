package week3.day2.classroom;

public class Desktop implements Hardware, Software{
	
	public void desktopModel() {
		System.out.println("print class desktop model");

	}

	public void hardwareResources() {
		System.out.println("print interface hardware resource");
		
	}
	
	public void softwareResources() {
		System.out.println("print interface software resource");
		
	}
	
	public static void main(String[] args) {
		Desktop mydesk = new Desktop();
		
		mydesk.hardwareResources();
		
		mydesk.softwareResources();
		
		mydesk.desktopModel();
		
				
	}
	

}
