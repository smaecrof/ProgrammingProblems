/**
 * Description: A component class used to learn more about
 * encapsulation  
 * @author MaeCroft22
 * Date Created: 05/26/2020
 * Date Last Modified: 05/26/2020
 */
public class Printer {
	
	private int numberofPagesPrinted = 0; 
	private boolean isDuplex; 
	private double currentTonerLevel = 100;
	private final double TONERUSAGECONSTANT = 0.05; // How much toner is used per page printed
	
	public Printer(boolean isDuplex, double currentTonerLevel) {
		this.isDuplex = isDuplex;
		if(currentTonerLevel > 0 && currentTonerLevel <= 100) {
			this.currentTonerLevel = currentTonerLevel; 
		}
	} 
	
	
	public void fillToner() {
		this.currentTonerLevel = 100; 
	}
	
	public void printPage(int numberPagesToPrint) {
		this.numberofPagesPrinted += numberPagesToPrint; 
		this.currentTonerLevel -= TONERUSAGECONSTANT * numberPagesToPrint; 
	}
	
	public boolean isDuplex() {
		return this.isDuplex; 
	}
	
	public double getCurrentTonerLevel() {
		return this.currentTonerLevel; 
	}
	
}
