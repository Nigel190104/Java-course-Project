package ProblemSet_3b;

public class test {

	public static void main(String[] args) {
		/*AnnualSalary mySalary = new AnnualSalary();
		System.out.println("Salary  : " + mySalary.getSalary() + "\n Calculated tax: " + 
		mySalary.calculateTax());*/
		
		AnnualSalary salary = new AnnualSalary();
		salary.setSalary(100000);
		System.out.println(salary.calculateTax());
		System.out.println(1*0.45);
	}

}
