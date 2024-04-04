package ProblemSet_5b;

public class Test {

	public static void main(String[] args) {
		Customer customer = new Customer("Alice", "Wonderland");
	    GasBill bill = new GasBill("G1234-5678-1234", 100, customer);
	    
	    System.out.println(bill.getAccountNumber());
	    System.out.println(bill.displayAccountDetails());
	    System.out.println(bill.getCustomer());
	    
	    bill = new GasBill("123456781234", 200, customer);
	    System.out.println(bill.getAccountNumber());
	    System.out.println(bill.getAccountNumber());
	    
	}

}
