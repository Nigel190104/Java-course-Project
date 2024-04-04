package ProblemSet_2b;

public class test {

	public static void main(String[] args) {
		Meal meal = new Meal(new Food("Vegetarian Stuffed Peppers", 2),
				new Food("Fruit Salad", 45));
		System.out.println(meal.calculateTotalSugarLevel());
	}

}
