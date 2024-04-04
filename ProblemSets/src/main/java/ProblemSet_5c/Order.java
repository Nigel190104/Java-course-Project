package ProblemSet_5c;

import java.util.ArrayList;
import java.util.List;

public class Order {
	public List<Pizza> pizzas;
	public Customer customer;
	
	public Order(Customer customer) {
		this.customer = customer;
		this.pizzas = new ArrayList<Pizza>();
	}
	
	public void addPizza(Pizza pizzas) {
		this.pizzas.add(pizzas);
	}
	
	public double calculateTotal() {
		double calculatePizzaPrice = 0;
		for(Pizza howmany : this.pizzas) {
			   if (howmany !=  null) {
				   calculatePizzaPrice += howmany.calculateCost();
			   }
		   }
		return calculatePizzaPrice;
	}
	
	public String printReceipt() {
		char[] firstnameParseArray = this.customer.name.toCharArray();
		String ReceiptString = "";
		ReceiptString = Double.toString(this.calculateTotal());
		
		return "Customer: "+firstnameParseArray[0] +". "+ this.customer.surname +"\n"+ 
		"Number of Pizzas: "+ this.howManyPizzasOrder() +"\n"+"Total Cost: " + ReceiptString;
	}
	
	public int howManyPizzasOrder() {
		int numOfPizzas = 0;
		for(Pizza howmany : this.pizzas) {
			   if (howmany !=  null) {
				   numOfPizzas += 1;
			   }
		   }
		return numOfPizzas;
	}
}