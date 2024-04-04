package ProblemSet_4c;

import ProblemSet_4c.Student;

public class Student {
	public char initial;
	public String name;
	public Module[] modules;
	
	public Student(char initial, String name) {
		this.modules = new Module[8];
		this.name = name;
		this.initial = initial;
	}
	
	public int calculateYearAverage() {
		   double TotalGrade = 0;
		   int ModuleLength = 0;
		   double TrueAverage = 0;
		   int intAverage = 0;
		   for(Module howmany : modules) {
			   if (howmany !=  null) {
				   ModuleLength +=1;
			   }
		   }
		   if (ModuleLength == 0) {
			   		   
		   }
		   else {
			   for(int i = 0; i<=ModuleLength-1;i++) {
				double accumulatorGrade = this.modules[i].getAverage();
				TotalGrade = TotalGrade + accumulatorGrade;
				if(i == ModuleLength-1) {
					TrueAverage = TotalGrade/ModuleLength;
				}
			}
			 intAverage = (int)TrueAverage;
		   }
		   return  intAverage;
	}
	
	public String displayArray() {
		double TotalGrade = 0;
		   int ModuleLength = 0;
		   double TrueAverage = 0;
		   int intAverage = 0;
		   String output = "";
		   for(Module howmany : modules) {
			   if (howmany !=  null) {
				   ModuleLength +=1;
			   }
		   }
		   if (ModuleLength == 0) { 		   
		   }
		   else {
			   for(int i = 0; i<=ModuleLength-1;i++) {
				double accumulatorGrade = this.modules[i].getAverage();
				String concatenate = this.modules[i].code + ": " + 
				this.modules[i].getAverage() + "\n";
				TotalGrade = TotalGrade + accumulatorGrade;
				if(i == ModuleLength-1) {
					TrueAverage = TotalGrade/(ModuleLength);
				}
				output =   output+concatenate;
			} 
		   }
		   intAverage = (int)TrueAverage;
		   return output + "Year Average: " + intAverage +"%";
	}
	
	public Module getModules(int index) {
		return this.modules[index];
	}
	
	public String getStudentDetails() {
		return initial + ". " + name + " " + calculateYearAverage() + "%";
	}
	
	public void setModules(int index, String code, double average) {
		Module newMod = new Module(code, average);
		this.modules[index] = newMod;
		this.modules[index].code = code;
		this.modules[index].average = average;
	}
}
