import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		/*
		ArrayList<Integer> items = new ArrayList<>(); 
		items.add(1);
		items.add(2);
		items.add(3);
		items.add(4); 
		items.add(5);
		//items.add("Spencer"); NOT POSSIBLE DUE TO DEFINED ARRAYLIST TYPE 
		
		printDoubled(items);
		*/
		
		FootballPlayer joe = new FootballPlayer("Joe"); 
		BaseballPlayer pat = new BaseballPlayer("Pat"); 
		BaseballPlayer jose = new BaseballPlayer("Jose"); 
		SoccerPlayer beckham = new SoccerPlayer("Beckham"); 
		
		Team<FootballPlayer> adelaidCrows = new Team<>("Adelaide Crows");
		Team<BaseballPlayer> yankees = new Team<>("Yankees");
		Team<SoccerPlayer> stars = new Team<>("Chicago Stars"); 
		Team<BaseballPlayer> astros = new Team<>("Houston Astros"); 
		
		astros.addPlayer(jose); 
		adelaidCrows.addPlayer(joe); 
		yankees.addPlayer(pat);
		stars.addPlayer(beckham);
		
		System.out.println(adelaidCrows.getNumberOfPlayers());  
		
		// Competition 
		yankees.matchResult(astros, 4, 2);
		yankees.matchResult(astros,3,5); 
		yankees.matchResult(astros,5,1); 
		
		System.out.println(yankees.compareTo(astros)); 
		
	}
	
	public static void printDoubled(ArrayList<Integer> itemsList) {
		
		for(int i: itemsList) {
			System.out.println(i * 2); 
		}
	}
}
