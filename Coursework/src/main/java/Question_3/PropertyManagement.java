package Question_3;
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
//a property that has 3 complaints marked as HIGH would
//be more problematic than a property that has 3 complaints
//that are marked as LOW or MEDIUM.
//The method returns the String representation of
//the property's object reference.
//finds the mostProblematicProperty so therefore we
//will need some sort of temp variable such that only when there exist a
//property with a higher ranking in terms of problems will it switch
//we will assume for this model that there will
//not be two properties with the same ranking or
//highest ranking for problems add the weightings to determine
//if the complaints of a property are highest
	public String findProblematicProperty() {
		Property mostValued = null;
	    int highestSum = Integer.MIN_VALUE;
		for (Property p : properties) {
			int sev1 = 0;
			int sev2 = 0;
			int sev3 = 0;
			for (Complaint c : p.getComplaint()) {
				if (c.getSeverity().getWeight() == 3) {
					sev3 += 3;
				}
				if (c.getSeverity().getWeight() == 2) {
					sev2 += 2;
				}
				if (c.getSeverity().getWeight() == 1) {
					sev1++;
				}
			}
			int currentSum = sev1 + sev2 + sev3;
		        if (currentSum > highestSum) {
		            highestSum = currentSum;
		            mostValued = p;
		        }
		}
		if (mostValued != null) {
		    return mostValued.toString();
		} else {
		    return "No problematic property found";
		}
	}
//This method provides a summary of all the tenants
//that are allocated to properties that
//the letting agency manages. When called, a String is displayed
//formatted in the following structure, demonstrating how
//many tenants are from each specific age bracket (i.e. 17-25),
//and how many are categorised as professionals
//(i.e. full time employees) or students:
	public String displayInfographics() {
		int ageRange1 = 0;
		int ageRange2 = 0;
		int ageRange3 = 0;
		int ageRange4 = 0;
		int ageRange5 = 0;
		int tenProf = 0;
		int tenStu = 0;
		String tenantSum = "";
		for (Property p : properties) {
			for (Room r : p.rooms.keySet()) {
				if (p.rooms.get(r).getAge() >= 17
					&&	p.rooms.get(r).getAge() <= 25) {
					if (p.rooms.get(r).getType()
						==	TenantType.PROFESSIONAL) {
						tenProf++;
					}
					if (p.rooms.get(r).getType() ==
							TenantType.STUDENT) {
						tenStu++;
					}
					ageRange1++;
				}
				if (p.rooms.get(r).getAge() > 25
					&&	p.rooms.get(r).getAge() <= 35) {
					if (p.rooms.get(r).getType()
						==	TenantType.PROFESSIONAL) {
						tenProf++;
					}
					if (p.rooms.get(r).getType()
						==	TenantType.STUDENT) {
						tenStu++;
					}
					ageRange2++;
				}
				if (p.rooms.get(r).getAge() > 35
					&&	p.rooms.get(r).getAge() <= 49) {
					if (p.rooms.get(r).getType()
						==	TenantType.PROFESSIONAL) {
						tenProf++;
					}
					if (p.rooms.get(r).getType()
						==	TenantType.STUDENT) {
						tenStu++;
					}
					ageRange3++;
				}
				if (p.rooms.get(r).getAge() > 49
					&&	p.rooms.get(r).getAge() <= 60) {
					if (p.rooms.get(r).getType()
						==	TenantType.PROFESSIONAL) {
						tenProf++;
					}
					if (p.rooms.get(r).getType()
						==	TenantType.STUDENT) {
						tenStu++;
					}
					ageRange4++;
				}
				if (p.rooms.get(r).getAge() > 60) {
					if (p.rooms.get(r).getType()
						==	TenantType.PROFESSIONAL) {
						tenProf++;
					}
					if (p.rooms.get(r).getType()
						==	TenantType.STUDENT) {
						tenStu++;
					}
					ageRange5++;
				}
			}
		}
		tenantSum = "Confirmed Tenant Summary:\n"
				+ "17-25:" + ageRange1 + "\n"
				+ "26-35:" + ageRange2 + "\n"
				+ "36-49:" + ageRange3 + "\n"
				+ "50-60:" + ageRange4 + "\n"
				+ "60+:" + ageRange5 + "\n"
				+ "*****\n"
				+ "Professional:"  + tenProf + "\n"
				+ "Student:" + tenStu;
		return tenantSum;
	}

	public void removeProperty(Property p) {
		//we could instead check if p is contained within
		if(properties.contains(p)) {
			properties.remove(p);
		}
		else {
				throw new IllegalArgumentException("");
		}
	}
	//displays how many houses or flats
	//there are in the propeties list depedngin on
	//if teh input is a of house class
	//it will give how many
	//house and vice versa for flats
	public int numberOfPropertyType(String type) {
		Property house = new
			House(1, "Percy Road", "Guildford", "GU2 7XH", 2);
		Property flat = new
			Flat(1, "The Chase", "Guildford", "GU2 7UB", 5, 2);
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
		//it chekcks that for that property it only
		//contains studetnts to be considered exempt
		for (Property p : properties) {
			//we want to iterate over the room map and
			//check if there exist a professional
				List retrieveIndex =
					new ArrayList(p.rooms.keySet());
				//only increments if and only if there is no professonal in
				//any of the rooms assigned to a property
				for (Room r : p.rooms.keySet()) {
					checkCounter++;
					if (p.rooms.get(r).getType()
							== TenantType.PROFESSIONAL) {
						break;
					}
					if (checkCounter ==
							retrieveIndex.size() - 1) {
						ratioStu++;
					}
				}
				checkCounter = 0;
		} //need to convert to double first
		double percentExempt = (((double) ratioStu) / (double) (counter)) * 100;
		//double value = counter / subtract;
		return percentExempt;
	}
}
