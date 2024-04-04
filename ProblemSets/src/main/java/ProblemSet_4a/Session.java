package ProblemSet_4a;

public class Session {
	private String sessionName;
	public int startTime;
	public int endTime;
	
	public Session(String name,int startTime, int endTime ) {
		this.sessionName = name;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public String getSessionName() {
		return sessionName;
	}

	public void setsessionName(String name) {
		this.sessionName = name;
	}
	
	
	
	
}
