import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	private static ArrayList<Album> albums = new ArrayList<Album>(); 
	private static ArrayList<Song> playlist = new ArrayList<Song>();
	private static Iterator<Song> songIterator = playlist.iterator(); 
	
	public static void main(String[] args) {
		
		// CREATING INDIVIDUAL ALBUMS
		Album darkLanes = new Album("Dark Lane Demo Tapes", "Drake"); 
		darkLanes.addSongToAlbum(new Song("Deep Pockets", 3.43));
		darkLanes.addSongToAlbum(new Song("When to say when", 3.43));
		darkLanes.addSongToAlbum(new Song("Chicago Freestyle", 3.40));
		
		Album scorpion = new Album("Scorpion", "Drake"); 
		scorpion.addSongToAlbum(new Song("Survival", 2.16));
		scorpion.addSongToAlbum(new Song("Nonstop", 3.59));
		scorpion.addSongToAlbum(new Song("Elevate", 3.05));
		
		Album moreLife = new Album("More Life", "Drake"); 
		moreLife.addSongToAlbum(new Song("Free Smoke", 3.39));
		moreLife.addSongToAlbum(new Song("No Long Talk", 2.30));
		moreLife.addSongToAlbum(new Song("Passionfruit", 4.59));
		
		// ALBUMS ADDED TO COLLECTION OF ALBUMS 
		albums.add(darkLanes); 
		albums.add(scorpion); 
		albums.add(moreLife); 
		
			
		// ADD SONGS TO PLAYLIST
		addSongToPlaylist(darkLanes.getSong("Deep Pockets")); 
		addSongToPlaylist(moreLife.getSong("Free Smoke")); 
		addSongToPlaylist(darkLanes.getSong("Chicago Freestyle")); 
		addSongToPlaylist(scorpion.getSong("Nonstop")); 
		
		// Song that isn't part of an album (Shouldn't be able to add to playlist)
		//Song albumlessSong = new Song("Error Song", 0.00); 
		//addSongToPlaylist(albumlessSong); 
		
		menuOptions(); 
	}
	
	public static void addSongToPlaylist(Song song) {
		if(!isSongInAlbums(song)) {
			System.out.println("Error 101: Must own song to add to playlist"); 
			return; 
		}
		
		playlist.add(song); 
	}
	
	private static boolean isSongInAlbums(Song song) {
		Iterator<Album> iterator = albums.iterator(); 
		 
		while(iterator.hasNext()) {
			 if(iterator.next().hasSong(song.getTitle())) {
				 return true; 
			 }
		}
		return false; 
	}

	
	
	public static void menuOptions() {
		
		Scanner scanner = new Scanner(System.in);
		int usersChoice; 
		
		System.out.println("******** OPTIONS ********"
				+ "\n 1: Skip Forward "
				+ "\n 2: Skip Backwards"
				+ "\n 3: Replay current song"
				+ "\n 4: List the song"
				+ "\n 5: Exit Application"
				+ "\n Enter number: "); 
		
		usersChoice = scanner.nextInt(); 
		
		switch(usersChoice) {
		case 1:
			skipSongForward(); 
			break; 
		case 2: 
			//skipSongBackwards(); 
		}
	}
	
	public static void skipSongForward() {
		if(songIterator.hasNext()) {
			System.out.println("Current Song: " + songIterator.next().getTitle()); 
		} else {
			System.out.println("End of playlist"); 
		}
	}
}
