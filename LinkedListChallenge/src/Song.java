
public class Song {

	private String title; 
	private double durationInMinutesAndSeconds; 
	
	public Song(String title, double durationInMinutesAndSeconds) {
		this.title = title; 
		this.durationInMinutesAndSeconds = durationInMinutesAndSeconds; 
	}
	
	public String getTitle() {
		return this.title; 
	}
	
	public double getDurationInMinutesAndSeconds() {
		return this.durationInMinutesAndSeconds; 
	}
	
	
}
