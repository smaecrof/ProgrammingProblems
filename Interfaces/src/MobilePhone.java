
public class MobilePhone implements ITelephone{

	private int myNumber; 
	private boolean isOn = false; 
	private boolean isRinging; 
	
	
	public MobilePhone(int phoneNumber) {
		this.myNumber = phoneNumber; 
	}
	@Override 
	public void powerOn() {
		isOn = true; 
		System.out.println("Mobile Phone powering up"); 
	}
	
	@Override 
	public void dial(int phoneNumber) {
		if(isOn) {
			System.out.println("Now ringing " + phoneNumber + " on Mobile Phone"); 
		} else {
			System.out.println("Phone is switched off"); 
		}
	}
	
	@Override 
	public void answer() {
		if(isRinging) {
			System.out.println("Answering the Mobile phone"); 
			isRinging = false; 
		}
	}
	
	@Override 
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber == myNumber && isOn) {
			isRinging = true; 
			System.out.println("Beep Beep"); 
		} else {
			System.out.println("Wrong phone number or phone is not on"); 
			isRinging = false; 
		}
		return isRinging; 
	}
	
	@Override 
	public boolean isRinging() {
		return isRinging; 
	}
}
