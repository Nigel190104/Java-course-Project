package ProblemSet_4a;

public class Test {

	public static void main(String[] args) {
		Day d3 = new Day("Wednesday");
		Session s1 = new Session("COM1027", 9, 11);
		Session s2 = new Session("COM1025", 12, 13);
		Session s3 = new Session("COM1026", 15, 17);
		//Session s4 = new Session("COM1027", 8, 11);
		d3.setSession(0, s1.getSessionName(), s1.getStartTime(), s1.getEndTime());
		d3.setSession(1, s2.getSessionName(), s2.getStartTime(), s2.getEndTime());
		d3.setSession(2, s3.getSessionName(), s3.getStartTime(), s3.getEndTime());
		//d3.setSession(3, s4.getSessionName(), s4.getStartTime(), s4.getEndTime());
		
		Day d2 = new Day("Monday");
		Session s4 = new Session("COM1023", 10, 12);
		
		d2.setSession(0, s4.getSessionName(), s4.getStartTime(), s4.getEndTime());
		//d2.setSession(0, s1.getSessionName(), s1.getStartTime(), s1.getEndTime());
		
		d3.display();
		d2.display();
	}

}
