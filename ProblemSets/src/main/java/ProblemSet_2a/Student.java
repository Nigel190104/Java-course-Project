package ProblemSet_2a;

public class Student {
	private String forename;
	private String surname;
	private int age;
	public Student(String fname, String Sname, int personAge) {
		forename = fname;
		surname = Sname;
		age = personAge;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setForename(String forename) {
		this.forename = forename;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getFullname() {
		return this.forename + " " +  this.surname;
	}

	public String getForename() {
		return forename;
	}

	public String getSurname() {
		return surname;
	} 
	
}
