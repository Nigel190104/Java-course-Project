package ProblemSet_8a;

public class Customer {
	private String name;
	private String surName;

	public Customer(String name, String surName)
			throws IllegalArgumentException {
		super();
		if (!(validateInfo(surName))) {
			throw new
			IllegalArgumentException("incorrect surname format");
		}
		if (!(validateInfo(name))) {
			throw new
			IllegalArgumentException("incorrect name format");
		}
		this.surName = surName;
		this.name = name;
	}
	public String getSurname() {
		return surName;
	}
	public void setSurname(String surName) {
		this.surName = surName;
	}
	public char getName() {
		char[] parseArray = this.name.toCharArray();
		return parseArray[0];
	}
	public boolean validateInfo(String info) {
		String surnamePattern = "([A-Z])([a-z]*)";
		Boolean validChecker =  false;
		if (info.matches(surnamePattern)) {
			validChecker = true;
		}
		return validChecker;
	}
	@Override
	public String toString() {
		return this.getName() + ". " + this.surName;
	}
}
