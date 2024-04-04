package ProblemSet_5c;


public class Pizza {
    public String[] toppings;
    
    public Pizza() {
    	this.toppings = new String[10];
    }
    
    public void addToppings(String[] toppingInputs) {
    	this.toppings = toppingInputs;
    }
    
    public String printToppings() {
    	String AllToppings = "";
    	for(String howmany : this.toppings) {
			   if (howmany !=  null) {
			    String individualToppings = howmany;
			    if(howmany == this.toppings[0]) {
			    	AllToppings = AllToppings + individualToppings;
			    }
			    else {
			    	AllToppings = AllToppings + ","+ individualToppings;
			    }
			   }
		   }
    	return AllToppings;
    }
    
    public double calculateCost() {
    	int numOfTops= 0;
    	double Cost = 0;
    	for(String howmany : this.toppings) {
			   if (howmany !=  null) {
				numOfTops +=1;
			   }
		   }
    	if(numOfTops == 0) {
    		Cost = 0;
    	}
    	if(numOfTops == 1) {
    		Cost = 9.99;
    	}
    	if(numOfTops == 2 || numOfTops == 3) {
    		Cost = 10.99;
    	}
    	if(numOfTops == 4 || numOfTops == 5) {
    		Cost = 11.99;
    	}
    	if(numOfTops == 6) {
    		Cost = 12.99;
    	}
    	if(numOfTops == 7) {
    		Cost = 13.99;
    	}
    	if(numOfTops == 8) {
    		Cost = 14.99;
    	}
    	if(numOfTops == 9) {
    		Cost = 15.99;
    	}
    	if(numOfTops == 10) {
    		Cost = 14.99;
    	}
    	return Cost;
    }
}