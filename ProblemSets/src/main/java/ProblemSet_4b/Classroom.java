package ProblemSet_4b;


public class Classroom {
   public String name;
   private final int CAPACITY = 20;
   public Student maxStudents[];
   
   
   public Classroom(String name) {
	   this.maxStudents = new Student[CAPACITY];
	   this.name = name;
	   
   }
   
   public void addStudents(int index, char initial, String surname){
	   Student newStudent = new Student(initial, surname);
	   this.maxStudents[index] = newStudent;
	   this.maxStudents[index].initial = initial;
	   this.maxStudents[index].surname = surname;
   }
   
   public String getSummary() {
	   String output = "";
	   int StudentLength = 0;
	   for(Student howmany : maxStudents) {
		   if (howmany !=  null) {
			   StudentLength +=1;
		   }
	   }
	   if (StudentLength == 0) {
		   output = "No students added";		   
	   }
	   else {
		   for(int i = 0; i<=StudentLength-1;i++) {
			String concatenate = this.maxStudents[i].getStudentDetails() + "\n";
			output =   output+concatenate;
		}
	   }
		
		return output;
   }
   
   public int howManyStudents() {
	   int StudentLength = 0;
	   for(Student howmany : maxStudents) {
		   if (howmany !=  null) {
			   StudentLength +=1;
		   }
	   }
	   return StudentLength;
   }

	public int getCapacity() {
		return CAPACITY;
	}

	public String getRoom() {
		return name;
	}
	
   
   
}
