package ProblemSet_7c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTracker {
	private List<Student> StudentList;
	private Map<Integer, Student> ModuleList;
	
	public StudentTracker() {
		this.StudentList = new ArrayList<Student>();
		this.ModuleList = new HashMap<Integer, Student>();
	}
	public void addStudent(Student s, List<Module> mList) {
		for(Module M: mList) {
			s.addModuleList(M);
		}
		this.StudentList.add(s);
	}
	public String printStudents() {
		String StudentPrinter = "";
		for(Student s: StudentList) {
			StudentPrinter += "" + s.getName() +"(" + s.getUrn() + ")" + "\n";
		}
		return StudentPrinter;
	}
	public String printModules(int urn) {
		String StudentsModules = "";
		initialiseMap();
		for(Integer key: ModuleList.keySet()) {
			if(key == urn) {
				StudentsModules = "URN " + key + " is enrolled in:\n" +ModuleList.get(key).printModules();
			}
		}
		return StudentsModules;
	}
	private void initialiseMap() {
		for(Student s: StudentList) {
			ModuleList.put(s.getUrn(), s);
		}
	}
}
//map.get(key) will return the urn
//map.get(value)