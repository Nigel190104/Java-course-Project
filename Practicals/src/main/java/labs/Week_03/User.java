package labs.Week_03;

public class User {
    private Email email = null;
    private String name = "nigel";
    
   public User(String nmae, Email email) {
	   this.email = email;
	   this.name = nmae;
   }

@Override
public String toString() {
	return "User [email=" + email + ", name=" + name + "]";
}
   
   
    		
}
