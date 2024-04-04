package ProblemSet_2b;

public class Meal {
     public Food MainCourse;
     public Food Dessert;
     
     public Meal(Food MainCourse, Food Dessert) {
    	 this.MainCourse = MainCourse;
    	 this.Dessert = Dessert; 	 
     }
     
     public double calculateTotalSugarLevel() {
    	 double sugarmain = MainCourse.getAmountOfSugar();
    	 double sugardes = Dessert.getAmountOfSugar();
    	 double totalsugar = sugarmain + sugardes;
    	 return totalsugar;
     }

	@Override
	public String toString() {
		return "Meal [mainCourse = " + MainCourse.getName() + ", dessert = " 
	+ Dessert.getName() + "]" ;
	}
     
     
}
