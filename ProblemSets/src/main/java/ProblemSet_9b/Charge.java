package ProblemSet_9b;

public class Charge {
	private Service service;
	private double charge;

	public Charge(Service service, double charge)
			throws IllegalArgumentException {
		super();
		if (charge <= 0) {
			throw new IllegalArgumentException("");
		}
		this.charge = charge;
		this.service = service;
	}

	public double calculateVAT() {
		//this value is used as a way in which to add tax
		//of different rates which is additive
		//on top of the amount  paid by the person
		//for the specified service rendered
		double calculateVat = 0;
		//used to check the value of rate assigned
		//to the service object created in this class
		if (this.service.getRate() == VATRate.LOW) {
			calculateVat = 5;
		}
		if (this.service.getRate() == VATRate.STANDARD) {
			calculateVat = 20;
		}
		if (this.service.getRate() == VATRate.ZERO) {
			calculateVat = 0;
		}
		return calculateVat;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}
}
