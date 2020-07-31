
public class Main {

	public static void main(String[] args) {
		ITelephone timsPhone; 
		timsPhone = new DeskPhone(9333884); 
		timsPhone.powerOn(); 
		timsPhone.callPhone(134523); 
		timsPhone.answer(); 
		
		ITelephone speensPhone = new MobilePhone(33342); 
		MobilePhone elisesPhone = new MobilePhone(42343); 
		
		speensPhone.powerOn(); 
		elisesPhone.powerOn();
		speensPhone.callPhone(33342); 
		elisesPhone.callPhone(42343); 
		speensPhone.answer(); 
		elisesPhone.answer(); 
		
	}
}
