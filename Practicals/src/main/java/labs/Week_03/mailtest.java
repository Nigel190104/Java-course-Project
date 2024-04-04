package labs.Week_03;

public class mailtest {
	public static void main(String[] args) {
		Email persson = new Email("surrey.ac.uk");
		System.out.println(persson.getEmailAddress());
		
		User user = new User("Bugs Bunny", persson);
		System.out.println(user.toString());

	}
}
