import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

	private String leagueName; 
	private ArrayList<T> teams; 
	
	public League(String name) {
		this.leagueName = name; 
		teams = new ArrayList<>(); 
	}
	
	public String getLeagueName() {
		return this.leagueName; 
	}
	
	public void addTeam(T team) {
		if(teams.contains(team)) {
			System.out.println(team.getTeamName() + " is already in " + this.leagueName); 
		} else {
			teams.add(team); 
			System.out.println(team.getTeamName() + " was added to " + this.leagueName); 
		}
	}
	
	public void showLeagueTable() {
		Collections.sort(teams); 
		for(T t: teams) {
			System.out.println(t.getTeamName() + ": " + t.getRanking()); 
		}
	}
}
