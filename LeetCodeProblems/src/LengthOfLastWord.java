public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("b  A  "));
    }

    public static int lengthOfLastWord(String s){
        int stringLength = s.length();
        int currStrLength = 0;
        int lStrLength = 0;

        for(int i = 0; i < stringLength; i++){
            if(s.charAt(i) == ' '){
                lStrLength = currStrLength > 0 ? currStrLength: lStrLength;
                currStrLength = 0;
            } else {
                currStrLength += 1;
            }
        }
        lStrLength = currStrLength > 0 ? currStrLength: lStrLength;
        return lStrLength;

    }
}
