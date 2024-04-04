package ProblemSet_4c;

public class Module {
	public String code;
	public double average;
	
	public Module(String code, double average){
		this.code = code;
		this.average = average;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	@Override
	public String toString() {
		return "Module [code=" + code + ", average=" + average + "]";
	}
	
	
}
