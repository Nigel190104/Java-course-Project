package ProblemSet_3c;

public class Employee {
	public int Id;
	public String Forename;
	public String Surname;
	public AnnualSalary Salary;
	public Position PositionName;
	
	public Employee(int Id, String Forename, String Surname, AnnualSalary salary, 
			Position companyPos) {
		this.Id = Id;
		this.Forename = Forename;
		this.Surname = Surname;
		this.Salary = salary;
		this.PositionName = companyPos;
	}
	
	public void displayEmployeeName() {
		System.out.println("Forename:" + this.Forename + "Surname: " + this.Surname);
	}
	
	public boolean eligibleForBonus() {
		boolean eligible = false;
		if(this.Salary.getSalary() > 40000) {
			eligible = true;
		}
		if(this.Salary.getSalary() < 40000) {
			eligible = false;
		}
		return eligible;
	}

	@Override
	public String toString() {
		String eligible = "";
		if(this.eligibleForBonus() == true) {
			 eligible = "is eligible for bonus";
		}
		if(this.eligibleForBonus() == false) {
			 eligible = "is not eligible for bonus";
		}
		return  Forename + "," + Surname  + "(" + Id +"): " + PositionName.getRoleName() +
				 " at " + "£" + Salary.getSalary() + " ("  + this.Salary.calculateTax() + ") " 
				+ "and " + eligible;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getForename() {
		return Forename;
	}

	public void setForename(String forename) {
		Forename = forename;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public double getSalary() {
		return this.Salary.getSalary();
	}

	public void setSalary(AnnualSalary salary) {
		Salary = salary;
	}

	public Position getPositionName() {
		return PositionName;
	}

	public void setPositionName(Position positionName) {
		PositionName = positionName;
	}
	
	
	
	
}
