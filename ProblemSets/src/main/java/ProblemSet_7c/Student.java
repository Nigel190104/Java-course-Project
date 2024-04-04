package ProblemSet_7c;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private String urn;
	private List<Module> ModuleList= new ArrayList<Module>();
	
	public Student(String name, String urn) {
		this.name = name;
		this.urn = urn;
		//ModuleList = moduleList;
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
