package Question_1;

public class Tenant implements ITenant {
	private String forename;
	private String surname;
	private int age = 0;
	private TenantType type;


	public Tenant(String fname, String sname,
		int age, TenantType type)
			throws IllegalArgumentException,
			 NullPointerException {
		//will need to add a age chekcer so that
		//only those of 17 and above can become
		//a tenant
		super();
		if (fname == null || sname == null
				|| age == 0 || type == null) {
		   throw new
			NullPointerException("dont accept null value ");
		}
		if (age <= 16) {
			throw new IllegalArgumentException("Age to low");
		}
		if (!checknames(fname)
				|| !checknames(sname)) {
			throw new IllegalArgumentException("wrong form");
		}
		this.forename = fname;
		this.surname = sname;
		this.age = age;
		this.type = type;
	}
	@Override
	public int getAge() {
		return age;
	}
	@Override
	public String getName() {
		return forename + " " + surname;
	}
	@Override
	public TenantType getType() {
		return type;
	}

	public boolean checknames(String name) {
		String nameCheck = "([A-Z])([a-z]*)";
		boolean matched = false;
		if (name.matches(nameCheck)) {
			matched = true;
		}
		return matched;
	}

}
