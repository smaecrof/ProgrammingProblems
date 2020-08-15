import java.util.Stack;

/**
 * Created by SMC on 08/14/2020
 */
public class ValidParentheses {
    // Stack Operation
    // {( )}
    // if currentChar == {[(  then push(currentChar)
    // if currentChar == }])  then pop(topChar) and it should match

    public static void main(String[] args) {
        runTestSuite();
    }

    public static boolean isValidParentheses(String str){
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{'){
                stack.push(str.charAt(i));
            } else if(str.charAt(i) == ')' && !stack.isEmpty() && stack.pop() == '('){
                continue;
            } else if(str.charAt(i) == '}' && !stack.isEmpty() && stack.pop() == '{'){
                continue;
            } else if(str.charAt(i) == ']' && !stack.isEmpty() && stack.pop() == '['){
                continue;
            } else {
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static boolean runTestSuite(){
        String[] strArray = new String[]{"{{}}", "()","]","{{}{}}","[][[[}"
                ,"","["};

        boolean[] boolArray = new boolean[]{true, true, false, true, false, true, false};

        for(int i = 0; i < strArray.length; i++){
            boolean result = isValidParentheses(strArray[i]);
            if(boolArray[i] != result){
                System.out.println("TEST FAILURE:");
                System.out.println("i: " + i);
                System.out.println("Input: " + strArray[i]);
                System.out.println("Expected: " + boolArray[i]);
                System.out.println("Result: " + result);
                return false;
            }
        }
        System.out.println("Test Suite PASSED");
        return true;
    }
}
