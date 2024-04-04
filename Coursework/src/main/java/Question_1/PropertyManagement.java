package Question_1;
import java.util.ArrayList;
import java.util.List;

public class PropertyManagement {
	private List<House> properties;


	public PropertyManagement() {
		super();
		this.properties = new ArrayList<House>();
	}
	//add the property to the properties
	//list
	public void addProperty(House p) {
		properties.add(p);
	}
	//adds the tenant to the room associated
	//with house object given as input
	public void addTenant(House p, Room r, ITenant t) {
		p.occupy(r, t);
	}
	//this displays all properties and the
	//to string associated with them
	//which will show the details associated with
	//each one
	public String displayProperties() {
		String propDetails = "";
		for (House property: properties) {
			propDetails +=
					property.toString() + "\n";
		}
		return propDetails;
	}
	//remove the property given as input
	//form the properites array if
	//the array contains said property
	public void removeProperty(House p) {
		//we could instead check if p is contained within
		if (properties.contains(p)) {
			properties.remove(p);
		} else {
				throw new IllegalArgumentException("");
			}
	}
}
