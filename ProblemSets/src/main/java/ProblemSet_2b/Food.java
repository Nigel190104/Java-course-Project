package ProblemSet_2b;

public class Food {
	public String name;
	public double sugar;
	
	public Food(String foodname ,double sugaramount ) {
		this.sugar = sugaramount;
		this.name = foodname;
	}
	
	public String getName() {
		return this.name;
	}

	public double getAmountOfSugar() {
		return this.sugar;
	}

	
	
}
