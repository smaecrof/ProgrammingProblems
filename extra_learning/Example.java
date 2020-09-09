/* 
 * This is a simple program 
*/

class Example{
	public static void main(String[] args){
		System.out.println("This is a simple Java program");

		int array[] = {2,4,6,8};
		int array2[] = new int[4];

		for(var i = 0; i < 4; i++){
			array2[i] = (i+1) * 2; 
		}

		for(int i = 0; i < 4; i++){
			System.out.println("array[" + i + "] = " + array[i]); 
			System.out.println("array2[" + i + "] = " +  array2[i]);
		}
	}
}
