package Question_2;
import java.util.ArrayList;
import java.util.List;

public class PropertyManagement {
	private List<Property> properties;


	public PropertyManagement() {
		super();
		this.properties = new ArrayList<Property>();
	}
	//add the property to the properties
	//list
	public void addProperty(Property p) {
		properties.add(p);
	}
	//adds the tenant to the room associated
	//with house object given as input
	public void addTenant(Property p, Room r, ITenant t) {
		p.occupy(r, t);
	}
	//this displays all properties and the
	//to string associated with them
	//which will show the details associated with
	//each one
	public String displayProperties() {
		String propDetails = "";
		for (Property property: properties) {
			if (property.getAvailableRooms() == 0) {
				propDetails +=
					property.displayOccupiedProperty() + "\n";
			} else {
				propDetails += property.toString() + "\n";
			}
		}
		return propDetails;
	}
	//remove the property given as input
	//form the properites array if
	//the array contains said property
	public void removeProperty(Property p) {
		//we could instead check if p is contained within
		if (properties.contains(p)) {
			properties.remove(p);
		} else {
				throw new IllegalArgumentException("");
			}
	}
//displays how many houses or flats
//there are in the propeties list depedngin on
//if teh input is a of house class
//it will give how many
//house and vice versa for flats
	public int numberOfPropertyType(String type) {
		Property house =
			new House(1, "Perc", "Guildford", "GU2 7XH", 2);
		Property flat =
			new Flat(1, "The", "Guildford", "GU2 7UB", 5, 2);
		int houseCounter = 0;
		int flatCounter = 0;
		int totalCount = 0;
		if (type == "house") {
			for (Property p : properties) {
				if (p.getClass() == house.getClass()) {
					houseCounter += 1;
				}
			}
		}
		if (type == "flat") {
			for (Property p : properties) {
				if (p.getClass() == flat.getClass()) {
					flatCounter += 1;
				}
			}
		}
		if (type == "house") {
			totalCount = houseCounter;
		}
		if (type == "flat") {
			totalCount = flatCounter;
		}
		return totalCount;
	}

	//This method returns the percentage of properties that are exempt
	//(i.e. only students live in the property) from council tax.
	public double percentageCouncilTaxExemption() {
		int counter = 0;
		int ratioStu = 0;
		int checkCounter = 0;
		for (Property p : properties) {
			counter++;
		}
		//it chekcks that for that property it only contains
		//studetnts to be considered exempt
		for (Property p : properties) {
			//we want to iterate over the room map and check
			//if there exist a professional
				List retrieveIndex = new ArrayList(p.rooms.keySet());
				//only increments if and only if
				//there is no professonal in
				//any of the rooms assigned to a property
				for (Room r : p.rooms.keySet()) {
					checkCounter++;
					if (p.rooms.get(r).getType()
							== TenantType.PROFESSIONAL) {
						break;
					}
					if (checkCounter
						==	retrieveIndex.size() - 1) {
						ratioStu++;
					}
				}
				checkCounter = 0;
		}//need to convert to double first
		double percentExempt = (((double) ratioStu)
				/ (double) (counter)) * 100;
		//double value = counter / subtract;
		return percentExempt;
	}
}
