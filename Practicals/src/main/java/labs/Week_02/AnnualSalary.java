package labs.Week_02;

public class AnnualSalary {
         private int limit;
         private int value;
         
         public AnnualSalary(int g) {
        	
        	this.limit = g;
        	 
         }
         
         public int getLimit(int limit){
        	 return value;
         }
         
         public void setValue(int value) {
        	 this.value = value;
         }
         
         public void increment() {
        	 this.value++;
        	 if(this.value==limit) {
        		 this.value=0;
        	 }
         }
         
}
