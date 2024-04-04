package ProblemSet_8b;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Counting {
	public Counting() {

	}
	public String readTextFile(String file) {
		String printLines = "";
		int counter = 0;
		try {
			BufferedReader readText =
				new BufferedReader(new FileReader(file));
			String readingLine = readText.readLine();
			while (readingLine != null) {
				counter++;
				printLines += displayLine(readingLine, counter);
				readingLine = readText.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		}
		return printLines;
	}
	public String displayLine(String line, int counter) {
		return line + " : " + counter + "\n";
	}
}
