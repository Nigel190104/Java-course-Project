package ProblemSet_5c;


public class Test {

	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		String[] toppings = new String[] { "cheese", "pepperoni", "tomato" };
		pizza.addToppings(toppings);
		
		System.out.println(pizza.printToppings());
	}

}
