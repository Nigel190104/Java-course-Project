package ProblemSet_3a;

public class Test {

	public static void main(String[] args) {
		Position Student = new Position();
		System.out.println(Student.getRoleName());
		Position companyPosition = new Position();
		
		companyPosition.setRoleName("Senior Lecturer");
		System.out.println(companyPosition.getRoleName());
	}

}
