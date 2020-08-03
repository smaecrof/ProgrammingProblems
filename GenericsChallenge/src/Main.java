import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// PLAYER CREATION 
		BaseballPlayer jose = new BaseballPlayer("Jose Altuve"); 
		BaseballPlayer carlos = new BaseballPlayer("Carlos Correa"); 
		BaseballPlayer justin = new BaseballPlayer("Justin Verlander"); 
		
		FootballPlayer odel = new FootballPlayer("Odel Beckham Jr"); 
		FootballPlayer manning = new FootballPlayer("Eli Manning"); 
		FootballPlayer barkley = new FootballPlayer("Barkley"); 
		
		BaseballPlayer derek = new BaseballPlayer("Derek Jeter"); 
		BaseballPlayer alex = new BaseballPlayer("Alex Rodriguez"); 
		BaseballPlayer didi = new BaseballPlayer("Didi Gregorious"); 
		
		FootballPlayer devin = new FootballPlayer("Devin Hester"); 
		FootballPlayer mack = new FootballPlayer("Kalil Mack"); 
		FootballPlayer brian = new FootballPlayer("Brian Urlacker"); 
		
		
		Team<BaseballPlayer> astros = new Team<>("Houston Astros"); 
		astros.addPlayer(jose);
		astros.addPlayer(carlos);
		astros.addPlayer(justin);
		
		Team<BaseballPlayer> yankees = new Team<>("New York Yankees"); 
		yankees.addPlayer(derek);
		yankees.addPlayer(alex);
		yankees.addPlayer(didi);
		
		Team<FootballPlayer> giants = new Team<>("New York Giants"); 
		giants.addPlayer(odel);
		giants.addPlayer(manning);
		giants.addPlayer(barkley);
		
		Team<FootballPlayer> bears = new Team<>("Chicago Bears"); 
		bears.addPlayer(devin);
		bears.addPlayer(mack);
		bears.addPlayer(brian);
		
		
		// LEAGUE CREATION 
		League<Team<BaseballPlayer>> mlb = new League<>("Major League Baseball"); 
		mlb.addTeam(astros);
		mlb.addTeam(yankees);
		
		League<Team<FootballPlayer>> nfl = new League<>("National Football League"); 
		nfl.addTeam(bears);
		nfl.addTeam(giants);
		
		System.out.println("\n"); 
		bears.playGame(giants, 10, 2);
		bears.playGame(giants, 7,3);
		bears.printTeamStatistics();
		giants.printTeamStatistics();
		
		nfl.showLeagueTable();
	}
	
	public static void printAllTeamStats(ArrayList<Team> teams) {
		
	}
}
