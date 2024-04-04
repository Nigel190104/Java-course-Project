package Question_2;

import java.util.HashMap;
import java.util.Map;

public abstract class Property {
	private int houseNumber = 0;
	private String street = "";
	private String city = "";
	private String postCode = "";
	private int numberOfRooms;
	protected Map<Room, ITenant> rooms;
	protected double councilTax;

//need to add validation later jsut need to get the important parts working
	public Property (int hn, String str, String city, String pC,
			int numRooms) throws IllegalArgumentException{
		super();
		if (!validateCity(city) || !validatePostCode(pC)) {
			throw new IllegalArgumentException("");
		}
		this.houseNumber = hn;
		this.street = str;
		this.city = city;
		this.postCode = pC;
		this.numberOfRooms = numRooms;
		this.rooms = new HashMap<Room, ITenant>();
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public int getAvailableRooms() {
		int occupiedrooms = 0;
		for (Room R : rooms.keySet()) {
			occupiedrooms++;
		}
		return numberOfRooms - occupiedrooms;
	}


	//get the value of the key pair we will iterate through
	//the hashmap adn for each room already existing
	//compare the tenatn to make sure they aren added.


	//include postcodes that follow the
	//following structure: XX0 0XX or XX00XX
	private boolean validateCity(String input) {
		boolean correctCity = false;
		if (input == "Guildford") {
			correctCity = true;
		}
		return correctCity;
	}

	private boolean validatePostCode(String input) {
		boolean correctPost = false;
		String vPostCheck = "GU[0-9] [0-9][A-Z]{2}";
		String vPostCheck2 = "GU[0-9]{2}[A-Z]{2}";
		if (input.matches(vPostCheck) ||
				input.matches(vPostCheck2)) {
			correctPost = true;
		}
		return correctPost;
	}

	public double setCouncilTax(double tax) {
		//this value is used as a way in which to add tax
				//of different rates which is additive
				//on top of the amount  paid by the person
				//for the specified service rendered
				councilTax = 0;
				int stuCount = 0;
				int profCount = 0;
				for(Room p : rooms.keySet()) {
					if (rooms.get(p).getType()
							== TenantType.STUDENT) {
						stuCount++;
					}
					if (rooms.get(p).getType()
						== TenantType.PROFESSIONAL) {
						profCount++;
					}
				}
				if (profCount == 0) {
					councilTax = tax * 0;
				}
				if (profCount == 1) {
					councilTax = tax * 0.75;
				}
				if (stuCount == 0) {
					councilTax = tax;
				}
				return councilTax;
	}

//may need to review this
	public abstract boolean isAvailable();
	public abstract void occupy(Room r, ITenant t);
	public abstract String displayOccupiedProperty();
	public abstract double getPrice();

	@Override
	public String toString() {
		return houseNumber + " " + street + ", " + city + " "
				+ postCode + " (" + numberOfRooms + " bedroom ";
	}

	public double getCouncilTax() {
		return councilTax;
	}
     //we need to make sure that getavailable or isavailiable such that
	//the council tax is only calculated when the property is fully

}
