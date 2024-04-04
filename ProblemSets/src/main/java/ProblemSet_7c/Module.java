package ProblemSet_7c;

public class Module {
	private String name = "";
	

	public Module(String name) {
		String modulePattern = "([C]{1})([O]{1})([M]{1})([0-9]{4})";
		if(name.matches(modulePattern)) {
			this.name = name;
		}
		else {
			this.name = "Error";
		}
	}


	public String getName() {
		return name;
	}


	
}
