package ProblemSet_2c;

public class Test {

	public static void main(String[] args) {
		Module Com1027 = new Module(new Assessment("lab1", 90.0),new Assessment("lab2", 68.0),
				new Assessment("Coursework", 72.0) );
		System.out.println(Com1027.toString());
		Module COM1028 = new Module(new Assessment("Labs1", 90.0), new Assessment("Labs2", 100.0),
				new Assessment("Coursework", 95.0));
		System.out.println(COM1028.toString());
	}
}
