import java.util.Iterator;
import java.util.LinkedList;

public class Album {

	private String albumName; 
	private String musiciansName; 
	private LinkedList<Song> songs; 
	
	public Album(String albumName, String musician) {
		this.albumName = albumName; 
		this.musiciansName = musician;
		this.songs = new LinkedList<Song>(); 
	}
	
	public String getAlbumName() {
		return this.albumName;
	}
	
	public String getMusiciansName() {
		return this.musiciansName; 
	}
	
	public void addSongToAlbum(Song song) {
		songs.add(song); 
	}
	
	public void addSongToAlbum(String title, double duration) {
		songs.add(new Song(title,duration)); 
	}
	
	public boolean hasSong(String title) {
	
		if(getSong(title) == null) {
			return false; 
		}
		return true; 
	}	
	
	
	public Song getSong(String searchedTitle) {
		
		Iterator<Song> iterator = songs.iterator(); 
		Song currentSong;  
		
		while(iterator.hasNext()) {
			currentSong = iterator.next(); 
			
			if(currentSong.getTitle().contentEquals(searchedTitle)) {
				return currentSong;
			}
		}
		
		return null; 
	}
}
