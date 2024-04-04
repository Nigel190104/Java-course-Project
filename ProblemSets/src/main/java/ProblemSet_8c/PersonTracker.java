package ProblemSet_8c;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class PersonTracker {
	private List<Person> peopleList;

	public PersonTracker() {
		super();
		this.peopleList = new ArrayList<Person>();
	}

	public String readTextFile(String file) {
		String printLines = "";
		try {
			BufferedReader readingText;
			readingText = new BufferedReader(new FileReader(file));
			String readingLine = readingText.readLine();
			while (readingLine != null) {
				breakLine(readingLine);
				readingLine = readingText.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		}
		return printLines;
	}
  //this will values given in input form thorhg values extracted from the file
	public void addPerson(String n, String s, int a) {
		Person newPerson = new Person(n, s, a);
		peopleList.add(newPerson);
	}
//
	public String displayList() {
		String fullPrint = "";
		for (Person p: peopleList) {
			fullPrint += p.toString() + "\n";
		}
		return fullPrint;
	}

	public void breakLine(String line) {
		String firstName = "";
		String surName = "";
		String strAge = "";
		int age = 0;

		String[] breakString = line.split(" ");
		firstName = breakString[0];
		surName = breakString[1];
		strAge = breakString[2];
		age = Integer.parseInt(strAge);
		addPerson(firstName, surName, age);
	}

	public String getPeopleList() {
		String print = "";
		int count = 0;
		for (Person p: peopleList) {
			if (p != null) {
				count += 1;
			}
		}
		for (Person p: peopleList) {
			if (p != null) {
				if (count == 1) {
					print += p.toString() + "";
			    } else {
					if (peopleList.indexOf(p) < count - 1) {
						print += p.toString() + ", ";
			        } else {
						print += p.toString() + "";
					}
				}
			}
		}
		return "[" + print + "]";
	}

}
