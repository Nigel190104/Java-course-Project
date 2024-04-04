package ProblemSet_4b;

public class Test {

	public static void main(String[] args) {
		Classroom lectureTheatre = new Classroom("AP3" );
/*
		lectureTheatre.addStudents(0, 'A', "Cooper");
		lectureTheatre.addStudents(1, 'S', "Kazamia");
		lectureTheatre.addStudents(2, 'J', "Bloggs");
		lectureTheatre.addStudents(3, 'B', "Ross");
		lectureTheatre.addStudents(4, 'E', "Zaid");
		lectureTheatre.addStudents(5, 'S', "Feng");
		*/
		System.out.println(lectureTheatre.getRoom());
		System.out.println(lectureTheatre.getSummary());
		System.out.println(lectureTheatre.getCapacity());

	}

}
