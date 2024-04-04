package Question_3;

public class Complaint {
	private String title;
	private Severity severity;

	public Complaint(String title, Severity severity) {
		super();
		this.title = title;
		this.severity = severity;
	}
	public String getTitle() {
		return title;
	}

	public Severity getSeverity() {
		return severity;
	}

}
