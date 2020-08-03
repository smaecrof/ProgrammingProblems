import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{

	private String teamName; 
	int gamesPlayed = 0; 
	int gamesWon = 0; 
	int gamesLost = 0; 
	int gamesTied = 0; 
	
	private ArrayList<T> members = new ArrayList<>(); 
	
	public Team(String name) {
		this.teamName = name; 
	}
	
	public String getTeamName() {
		return this.teamName; 
	}
	
	
	/*
	 * This method seems to break the rule of input/output combination in methods (do one thing)
	 * I will go back over "Clean Coder" again an see if this is an issue because I believe that in the
	 * book, it is said that having a method that returns a value and also accepts a parameter is bad practice 
	 * as it can lead to awkward method calls later down the line. (e.q. if(addPlayer(player1)){} ) 
	 */
	public boolean addPlayer(T player) {
		if(members.contains(player)) {
			System.out.println(player.getName() + " is already on this team");
			return false;
		} else {
			members.add(player);
			System.out.println(player.getName() + " picked for the team" ); 
			return true; 
		}
	}
	
	public int getNumberOfPlayers() {
		return this.members.size(); 
	}
	
	public void matchResult(Team<T> opponent, int ourScore, int opponentScore) {
		if(ourScore > opponentScore) {
			this.gamesWon++;
			System.out.println(this.getTeamName() + " Won");
		} else if(ourScore < opponentScore) {
			this.gamesLost++; 
		} else {
			this.gamesTied++; 
		}
		
		this.gamesPlayed++; 
		
		/*
		 * This last part of the method will call this same method in the opponent object
		 * so that the results are stored for the opponent as well. 
		 */
		if(opponent != null) {
			opponent.matchResult(null, opponentScore, ourScore); 
		}
	}
	
	public int ranking() {
		return (this.gamesWon * 2) + gamesTied; 
	}
	
	@Override 
	public int compareTo(Team<T> opponent) {
		if(this.ranking() > opponent.ranking()) {
			return -1;
		} else if (this.ranking() < opponent.ranking()) {
			return 1; 
		} else {
			return 0; 
		}
	}
}
