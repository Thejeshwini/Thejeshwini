package week3.day1.Assignment;

public class Students {
	
	public void getStudentInfo(int studentId) {
		System.out.println(studentId);

	}

	public void getStudentInfo(int studentId, String studentName) {
		
		System.out.println(studentId + " "+studentName);
	}

	public void getStudentInfo(String studentEmail, long studentPhoneNumber) {
		System.out.println(studentEmail+" "+ studentPhoneNumber);

	}
	
	public static void main(String[] args) {
		Students mystu = new Students();
		
		mystu.getStudentInfo(4527);
		mystu.getStudentInfo(5667, "sanju");
		mystu.getStudentInfo("teju@gmail.com", 8890527819L);
		
	}

}
