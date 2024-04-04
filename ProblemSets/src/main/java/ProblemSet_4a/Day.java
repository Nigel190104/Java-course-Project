package ProblemSet_4a;


public class Day {
    public String name;
    private Session[] sessions;
    
	public Day(String name) {
		this.sessions = new Session[4];
		this.name = name;
	}

	@Override
	public String toString() {
		String output = "";
		for(Session newsession :sessions) {
			if (newsession !=  null) {
				   String concatenate = newsession.getSessionName() + ": " +
					newsession.getStartTime() + " - " + newsession.getEndTime() + "\n";
		   output = output + concatenate;
			   }
			
		}
		return output;
	}
    
	public void setSession(int index, String moduleName, int startTime, int endTime) {
		Session createSession = new Session(moduleName, startTime, endTime);
		this.sessions[index] = createSession;
		this.sessions[index].setsessionName(moduleName);
		this.sessions[index].setEndTime(endTime);
		this.sessions[index].setStartTime(startTime);;
	}
	
	public void display() {
		System.out.println(name + "\n" + toString());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Session getSessions(int index) {
		return sessions[index];
	}
    
}
