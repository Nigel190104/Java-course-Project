package ProblemSet_9c;

import java.util.ArrayList;
import java.util.List;

public class Guest implements IGuest {
	private String forename = "";
	private String surname = "";
	private String address = "";
	private String telephone = "";
	//a list of charge objects which will be associated
	//with the guest will be used to decide how much
	//the guest should have to pay in accumulation
	//with addition of vat
	private List<Charge> charges;
	public Guest(String fname, String sname, String address, String phone) {
		super();
		this.forename = fname;
		this.surname = sname;
		this.address = address;
		this.telephone = phone;
		this.charges = new ArrayList<Charge>();
	}

	@Override
	//this is used to add new charges to the charges list
	//through service and double parameters assigned
	//to each charge
	public void addCharge(Service s, double c) {
		Charge newCharge = new Charge(s, c);
		charges.add(newCharge);
	}

	@Override
	public String toString() {
		return forename + " " + surname + ", "
				+ address + ", " + telephone;
	}

	@Override
	public double calculateTotalChargeWithoutVAT() {
		double totalCharge = 0;
		for (Charge ch: charges) {
			totalCharge += ch.getCharge();
		}
		return totalCharge;
	}

	@Override
	public double calculateVATChargeAtRate(VATRate r) {
		double vatRate = 0;
		for (Charge ch: charges) {
			if (ch.getService().getRate() == r) {
			 vatRate += (ch.getCharge()) / (100)
					 * (ch.calculateVAT());
			}
		}
		return vatRate;
	}

	@Override
	public double calculateTotalChargeIncVat() {
		double totalRate = 0;
		double reformat = 0;
		for (Charge ch: charges) {
			reformat = (ch.getCharge()) * (ch.calculateVAT()) / 100;
			totalRate +=  reformat + ch.getCharge();
		}
		return totalRate;
	}

	public String getForename() {
		return forename;
	}
	public String getSurname() {
		return surname;
	}
	public String getAddress() {
		return address;
	}
	public String getTelephone() {
		return telephone;
	}

	public List<Charge> getCharges() {
		return charges;
	}
}
