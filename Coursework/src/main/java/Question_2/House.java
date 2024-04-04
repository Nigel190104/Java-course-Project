package Question_2;

public class House extends Property{
//the house has been created but not occupieed
//maybe this is what we havent taken into consideration
//
	public House(int hn, String str, String city,
	String pC, int numRooms) throws IllegalArgumentException {
			super(hn, str, city, pC, numRooms);
		}
	@Override
	public double getPrice() {
		double totalPrice = 0;
		for (Room R : rooms.keySet()) {
			totalPrice += R.getPrice();
		}
		double comPrice = totalPrice * 12;
//tried to use below code to get it to return a value to
//two decimal places but it didnt work
//		DecimalFormat df = new DecimalFormat("#.##");
//        String price = df.format(comPrice);
//		double doubleValue = Double.parseDouble(price);
		return comPrice;
	}

	@Override
	public boolean isAvailable() {
		return rooms.isEmpty();
	}

	@Override
	public void occupy(Room r, ITenant t) {
		if (getAvailableRooms() != 0
			&& rooms.containsValue(t) == false) {
			rooms.put(r, t);
		}
	}

	@Override
	public String displayOccupiedProperty() {
		String roomsList = "";
		String output = "";
		for (Room R : rooms.keySet()) {
			roomsList += "\tRoom: " + R.getPrice() + "\n";
		}
		if(getPrice() % 1 == 0) {
			output = toString() + "\n" +  roomsList + "\t"
			+ "Total: £" + getPrice() + "0 (Council Tax: "
					+ "£" + getCouncilTax() + ")";
		}
		else {
			output = toString() + "\n" +  roomsList + "\t"
		     + "Total: £" + getPrice() + " (Council Tax: "
					+ "£" + getCouncilTax() + ")";
		}
		//will need to modify at a later date
		return output;
	}

	@Override
	public String toString() {
		return super.toString() + "house :"
			+ getAvailableRooms() + " available" + ")";
	}

}
