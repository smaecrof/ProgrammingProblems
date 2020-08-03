import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{

	private String teamName; 
	private int numberOfWins; 
	private int numberOfLosses; 
	private ArrayList<T> players; 
	
	public Team(String name) {
		this.teamName = name; 
		players = new ArrayList<>(); 
	}
	
	public String getTeamName() {
		return this.teamName; 
	}
	
	public int getNumberOfWins() {
		return this.numberOfWins; 
	}
	
	public void addPlayer(T playerToAdd) {
		if(players.contains(playerToAdd)) {
			System.out.println(playerToAdd.getPlayerName() + " is already on the team"); 
		} else {
			players.add(playerToAdd); 
			System.out.println("Added " + playerToAdd.getPlayerName() + " to the " + teamName); 
		}
	}
	
	public void playGame(Team<T> opponent, int ourScore, int opponentsScore) {
		if(ourScore > opponentsScore) {
			this.numberOfWins++; 
			System.out.println(teamName + " won the game"); 
		} else if (ourScore < opponentsScore) {
			this.numberOfLosses++; 
		} else {
			System.out.println("Is the game even over yet??"); 
		}
		
		/*
		 * Adds the scoring to the opponent as well. Hit two birds with one method call
		 */
		if(opponent != null) {
			opponent.playGame(null, opponentsScore, ourScore);
		}
	}
	
	public void printTeamStatistics() {
		System.out.println("\nStats for " + teamName + ":"); 
		System.out.println("Wins: " + numberOfWins); 
		System.out.println("Losses: " + numberOfLosses + "\n"); 
	}
	
	public int getRanking() {
		return (this.numberOfWins * 2); 
	}
	
	@Override
	public int compareTo(Team<T> team) {
		if(this.numberOfWins > team.getNumberOfWins()) {
			return 1; 
		} else if (this.numberOfWins < team.getNumberOfWins()){
			return -1; 
		} else {
			return 0; 
		}
	}
}
