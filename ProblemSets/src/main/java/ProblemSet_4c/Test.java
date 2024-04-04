package ProblemSet_4c;

public class Test {

	public static void main(String[] args) {
		Student bob = new Student('B', "Ross");
		Module emptyModule = new Module("empty", 0);
		bob.setModules(0, emptyModule.getCode(), emptyModule.getAverage());
		bob.setModules(1, emptyModule.getCode(), emptyModule.getAverage());
		bob.setModules(2, emptyModule.getCode(), emptyModule.getAverage());
		bob.setModules(3, emptyModule.getCode(), emptyModule.getAverage());
		bob.setModules(4, emptyModule.getCode(), emptyModule.getAverage());
		bob.setModules(5, emptyModule.getCode(), emptyModule.getAverage());
		bob.setModules(6, emptyModule.getCode(), emptyModule.getAverage());
		bob.setModules(7, emptyModule.getCode(), emptyModule.getAverage());
		
		System.out.println(bob.getStudentDetails());

		Student alice = new Student('A', "Wonderland");
		alice.setModules(0, "COM1025", 60);
		alice.setModules(1, "COM1026", 85);
		alice.setModules(2, "COM1027", 78);
		alice.setModules(3, "COM1031", 65);
		alice.setModules(4, "COM1028", 40);
		alice.setModules(5, "COM1029", 40);
		alice.setModules(6, "COM1032", 50);
		alice.setModules(7, "COM1033", 57);
		
		System.out.println(alice.getStudentDetails());
		
	}

}
