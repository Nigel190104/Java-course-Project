package ProblemSet_9b;

public class Service {
	private String code;
	private String name;
	private VATRate rate;
	public Service(String code, String name, VATRate rate)
		throws NullPointerException, IllegalArgumentException {
		super();
		String codePattern = "([A-Z]{4})([0-9]{5})";
		String servicePattern = "([a-zA-Z]*)";
		if (code == null || name == null) {
			throw new NullPointerException("");
		}
		if (!(name.matches(servicePattern))) {
			throw new IllegalArgumentException("");
		}
		if (!(code.matches(codePattern))) {
			throw new IllegalArgumentException("");
		}
		this.code = code;
		this.name = name;
		this.rate = rate;
	}
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public VATRate getRate() {
		return rate;
	}
}
