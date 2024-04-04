package ProblemSet_3c;

public class test {

	public static void main(String[] args) {
		AnnualSalary salary = new AnnualSalary();
		salary.setSalary(100000);

		Position companyPosition = new Position();
		companyPosition.setRoleName("Director");

		Employee employee = new Employee(1234, "Sid", "James", salary, companyPosition);

		 System.out.println(employee.getSalary());
	}

}
