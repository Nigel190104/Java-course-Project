package ProblemSet_6a;

public class Supplier {
	private String name;
	private String phone;
	private String Phonepattern = "([0]{1})([1]{1})([4]{1})([8]{1})([3]{1})([1-9]{6})";
	private String Phonepattern_2 = "([0]{1})([1]{1})([4]{1})([8]{1})([3]{1})([-]{1})([1-9]{6})";

	public Supplier(String name, String phone) throws IllegalArgumentException{
		this.name = name;
		if(phone.matches(Phonepattern)||phone.matches(Phonepattern_2)) {
			this.phone = phone;
		}
		else {
			throw new IllegalArgumentException("incorrect Phone format");
		}
	}
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}


	@Override
	public String toString() {
		return this.name + "("+this.phone+")";
	}
}
