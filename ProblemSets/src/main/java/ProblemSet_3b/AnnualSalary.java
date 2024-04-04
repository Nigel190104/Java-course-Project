package ProblemSet_3b;

public class AnnualSalary {
         private double salary;
         private final double PERSONAL_ALLOWANCE = 12570;
         
         public AnnualSalary() {
        	
         }
         
         public double calculateTax() {
        	 double taxcalculated = 0;
        	 if(salary > 125140) {
        		 double UppperQuadrant = (salary - 125140) * 0.45;
        		 double thirdQuadrant = (125140 - 50270) * 0.40;
        		 double SecondQuadrant = (50270 - PERSONAL_ALLOWANCE ) * 0.20;
        		 double firstQuadrant = (12570)*0;
        		  taxcalculated = UppperQuadrant + thirdQuadrant +
        				 SecondQuadrant + firstQuadrant;
        	 }
        	 if(salary <= 125140 && salary > 50271) {
        		 double thirdQuadrant = (salary - 50270) * 0.40;
        		 double SecondQuadrant = (50270 - PERSONAL_ALLOWANCE ) * 0.20;
        		 double firstQuadrant = (12570)*0;
        		  taxcalculated = thirdQuadrant +
        				 SecondQuadrant + firstQuadrant;
        	 }
        	 if(salary <= 50270 && salary > 12571) {
        		 double SecondQuadrant = (salary - PERSONAL_ALLOWANCE) * 0.20;
        		 double firstQuadrant = (12570)*0;
        		 taxcalculated = SecondQuadrant + firstQuadrant;	 
        	 }
        	 if(salary <= 12570) {
        		 double firstQuadrant = (salary)*0;
        		  taxcalculated = firstQuadrant;	 
        	 }
        	 return taxcalculated;
         }

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
        
		
         
}
