package Question_1;

import java.util.HashMap;
import java.util.Map;

public class House {
	private int houseNumber = 0;
	private String street = "";
	private String city = "";
	private String postCode = "";
	private int numberOfRooms;
	private Map<Room, ITenant> rooms;

//need to add validation later jsut need to get the important parts working
	public House(int hn, String str, String city, String pC,
			int numRooms) throws IllegalArgumentException {
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

	public int getAvailableRooms() {
		int occupiedrooms = 0;
		for (Room r: rooms.keySet()) {
			occupiedrooms++;
		}
		return numberOfRooms - occupiedrooms;
	}

	public double getPrice() {
		double totalPrice = 0;
		for (Room r: rooms.keySet()) {
			totalPrice += r.getPrice();
		}
		return totalPrice;
	}
	//get the value of the key pair we will iterate through
	//the hashmap adn for each room already existing
	//compare the tenatn to make sure they aren added.

	//may need to review this
	public boolean isAvailable() {
		return rooms.isEmpty();
	}

	public void occupy(Room r, ITenant t) {
		if (getAvailableRooms() != 0
				&& !(rooms.containsValue(t))) {
			rooms.put(r, t);
		}
	}
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
		if (input.matches(vPostCheck) || input.matches(vPostCheck2)) {
			correctPost = true;
		}
		return correctPost;
	}

	@Override
	public String toString() {
		return houseNumber + " " + street + ", " + city + " "
				+ postCode + " (" + numberOfRooms
			  + " bedroom house :" + getAvailableRooms()
				+ " available" + ")";
	}

//we call house within the property management class;
}
