package ProblemSet_4b;

public class Student {
	char initial;
	String surname;
	
	public Student(char initial, String surname) {
		this.initial = initial;
		this.surname = surname;
	}
	
	public String getStudentDetails(){
		return initial + ". " + surname;
	}
}
