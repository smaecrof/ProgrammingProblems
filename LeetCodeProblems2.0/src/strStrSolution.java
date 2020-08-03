
public class strStrSolution {

	public static int strStr(String haystack, String needle) {
		if(!haystack.contains(needle)) {
			return -1; 
		} else {
			return haystack.indexOf(needle); 
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(strStr("mississippi", "issip")); 
		System.out.println(strStr("Hello", "pi")); 
		System.out.println(strStr("mississippi", "pi")); 
	}
	
}


