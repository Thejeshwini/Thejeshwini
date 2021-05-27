package week3.day2.classroom;

public class College extends University{

	public static void main(String[] args) {
		College myColl = new College();
		myColl.pg();
		myColl.getug();
		
	}

	@Override
	public void getug() {
		System.out.println("print unimplemented method of ug from the college");
		
	}

}
