package labs.Week_03;

public class Email {
     private static final String DEFAULTADDRESS = "unknown@unknown";
     private String EmailAddress;
     
     public Email(String EA)  {
    	 this.EmailAddress = EA;
     }

	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}
     
     
}
