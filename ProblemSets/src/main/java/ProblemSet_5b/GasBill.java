package ProblemSet_5b;
//import java.util.Scanner;


public class GasBill {
	public String accountNumber;
	public double amount;
	public Customer customer;
	
	public GasBill(String accountNumber,double amount,Customer customer) {
		this.accountNumber = accountNumber;
		if(checkAccountAccuracy(accountNumber) == false) {
			this.accountNumber = "invalid account";
		}
		this.amount = amount;
		this.customer = customer;
	}
	
	public boolean checkAccountAccuracy(String accountNumber) {
		String accountChecker = accountNumber;
		boolean Mainchecker = false;
		boolean checker1 = false;
		boolean checker2 = false;
		boolean checker3 = false;
		boolean checker4 = false;
	    boolean checker5 = false;
	    boolean checker6 = false;
	    boolean checker7 = false;
		char[] numArray = {'1','2','3','4','5','6','7','8','9'} ;
		char[] ParseArray = accountChecker.toCharArray();
		for(int i = 0; i<=ParseArray.length-1;i++) {
			if(ParseArray.length == 15) {
				checker7 = true;
			
				if(ParseArray[0] == 'G') {
					checker1 = true;
				}
				if(ParseArray[5] == '-' || ParseArray[10] == '-') {
					checker2 = true;
					if(i==11) {
						checker3 = true;
					}
				}
			
			if(i>0 && i<5 || i>5 && i<10 || i >10 && i<14) {
					for(int g = 1; g<=4;g++) {
						for(char howmany : numArray) {
							   if (ParseArray[g] == howmany) {
								   checker4 = true;
							   }
						   }
					}
					for(int g = 6; g<=9;g++) {
						for(char howmany : numArray) {
							   if (ParseArray[g] == howmany) {
								   checker5 = true;
							   }
						   }
					}
					for(int g = 11; g<=14;g++) {
						for(char howmany : numArray) {
							   if (ParseArray[g] == howmany) {
								   checker6 = true;
							   }
						   }
					}
			}
		 }
		}
		if(checker1 && checker2&& checker3&& checker4&& checker5&& checker6&& checker7 == true) {
			Mainchecker = true;
		}
		return Mainchecker;	
	}
	
	public String displayAccountDetails() {
		char[] firstnameParseArray = customer.name.toCharArray();
		return "Gas Bill" + "\n" + " Account Number:" + accountNumber + "\n" +" Customer:"
	+ firstnameParseArray[0] +  ". " + customer.surname + "\n" 
		+" Amount Due:" + displayAmmountDue();
	}
	
	public String displayAmmountDue() {
		String DueString = "";
		DueString = Double.toString(this.amount);
		return DueString;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomer() {
		char[] firstnameParseArray = customer.name.toCharArray();
		return firstnameParseArray[0] +  ". " + customer.surname;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
