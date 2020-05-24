
public class StrStr {

    public static int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0; 
        }
        int firstOccurance = 0; 
        for (int i = 0; i < haystack.length() -1; i++){
        	System.out.println(haystack.charAt(i)); 
        	System.out.println(needle.charAt(0)); 
            if(haystack.charAt(i) == needle.charAt(0)){
                firstOccurance = i; 
                for (int j = i+1; j < needle.length() - 1; j++){
                    i++;
                    System.out.println("hay(i): " + haystack.charAt(i)); 
                    System.out.println("need(j): " + needle.charAt(j)); 
                    if(haystack.charAt(i) != needle.charAt(j)){
                        break; 
                    }
                    
                    if (j == haystack.length() -1){
                        return firstOccurance; 
                    }
                } 
            }
            
        } 
        
        return -1; 
    }
    
    
    public static void main(String[] args) {
    	System.out.println(strStr("hello", "ll")); 
    }
}
