package ProblemSet_9c;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	//the name of hotel
	private String name = "";
	//declaration of the list guest
	//which will contain all guests associated
	//with the hotel
	private List<IGuest> guests;
	public Hotel(String name) {
		super();
		this.name = name;
		this.guests = new ArrayList<IGuest>();
	}

	public void addGuest(IGuest guest) {
		guests.add(guest);
	}

	public String printGuestList() {
		String entireGuestList = "";
		for (IGuest guest: guests) {
			entireGuestList += guest.toString() + "\n";
		}
		return name + " Hotel\n" + "Guest List\n" + entireGuestList;
	}

	public List<IGuest> getGuests() {
		return guests;
	}

	public String getName() {
		return name;
	}
}
