import java.util.ArrayList;

/*
 * Basically a wrapper class for an int value 
 */
class IntClass {
	private int myValue;
	
	public IntClass(int myValue) {
		this.myValue = myValue;
	}


	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}


	public int getMyValue() {
		return myValue;
	} 
}


public class Autoboxing_Unboxing {
	
	public static void main(String[] args) {
		String[] strArray = new String[10];
		int[] intArray = new int[10];
		
		ArrayList<String> strArrayList = new ArrayList<String>(); 
		strArrayList.add("Time");
		
		// CANNOT DO
		// ArrayList<int> intArrayList = new ArrayList<int>(); 
		// This is due to int being a primitive type and not a class which is the only data 
		// structure we can use with ArrayLists that I know of so far
		// Eight Primitive Types: bit, byte, char, short, long, double, float, boolean 
		ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
		intClassArrayList.add(new IntClass(54)); 
		
		Integer integer = new Integer(54); 
		Double doubleValue = new Double(45.3); 
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>(); 
		for(int i = 0; i <= 10; i++) {
			intArrayList.add(Integer.valueOf(i)); 
		}
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i + " --> " + intArrayList.get(i).intValue()); 
		}
		
		// Quick Java shortcut
		// At compile time, converted with: 
		Integer myIntValue = 56;  // Integer.valueOf(56) 
		int myInt = myIntValue;   // myInt.intValue(); 
		
		
		ArrayList<Double> myDoubleValues = new ArrayList<Double>();
		for(double dbl = 0.0; dbl<=10.0; dbl += 0.5) {
			myDoubleValues.add(Double.valueOf(dbl)); 
			// myDoubleValues.add(dbl);  Would work as well 
		}
		
		for(int i = 0; i < myDoubleValues.size(); i++) {
			double value = myDoubleValues.get(i).doubleValue();
			// myDoubleValues.get(i) would work by itself as well 
			System.out.println(i + " --> " + value); 
		}
	}
}
