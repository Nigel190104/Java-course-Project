package ProblemSet_7b;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private String urn;
	private List<Module> ModuleList= new ArrayList<Module>();

	//need to perfrom validation on urn and name
	//if unacceptbale is given change to default which is 00000 if
	//refuired format or unnaccpetbal fvaleu is not give
	//for name the first letter of the name must be in caps
	//can be done via string checker.

	public Student(String name, String urn) {
		this.name = name;
		this.urn = urn;
		String correctnamePattern = "([A-Z]{1})([a-z]*)([ ]{1})([A-Z]{1})([a-z]*)";
		String lowerCaseNamePattern = "([a-z]{1})([a-z]*)([ ]{1})([a-z]{1})([a-z]*)";
		String oneUpperCaseOPattern = "([A-Z]{1})([a-z]*)([ ]{1})([a-z]{1})([a-z]*)";
		String oneUpperCaseSPattern = "([a-z]{1})([a-z]*)([ ]{1})([A-Z]{1})([a-z]*)";
		String urnPattern = "([0-9]{5})";
		if(urn.matches(urnPattern) == false) {
			this.urn = "00000";
		}
		if(name.matches(correctnamePattern) == false) {
			if(name.matches(lowerCaseNamePattern) == false) {
				if(name.matches(oneUpperCaseSPattern) && name.matches(oneUpperCaseOPattern)) {
					throw new IllegalArgumentException("name form is incorrect");
				}
			}
			//throw new NullPointerException("one of the entries provided name or code is null");
		}
	}

	public void setUrn(String urn) {
		this.urn = urn;
	}

	public int getUrn() {
		int intUrn = Integer.valueOf(urn);
		return intUrn;
	}
	//we need to iterate through all elements of the list and check if the module code is already in it
	public void addModuleList(Module M) {
		Boolean ModChecker = false;
		for(Module newmod : ModuleList) {
			if(M == newmod) {
				ModChecker = true;
			}
		}
		if(ModChecker == false) {
			this.ModuleList.add(M);
		}
	}

	public String printModules(){
		String ModulesTaken = "";
		int sizeOflist = ModuleList.size();
		int amountOfNonNullModules = 0;
		for(Module newmod : ModuleList) {
			if(newmod != null) {
				amountOfNonNullModules +=1;
			}
		}
		for(Module newmod : ModuleList) {
			if(newmod != null) {
				if(sizeOflist ==1) {
					ModulesTaken += newmod.getName() + "";
				}
				else {
					if(ModuleList.indexOf(newmod)<amountOfNonNullModules-1) {
						ModulesTaken += newmod.getName() + ", ";
			        }
					else {
						ModulesTaken += newmod.getName() + "";
					}
				}
			}

		}
		return ModulesTaken +"";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Module> getModuleList() {
		return ModuleList;
	}

	public void setModuleList(List<Module> moduleList) {
		ModuleList = moduleList;
	}

}
