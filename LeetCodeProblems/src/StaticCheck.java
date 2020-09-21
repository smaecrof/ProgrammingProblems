public class StaticCheck {
    static private int FIVE = 5;

    static public int getFive(){
        return FIVE;
    }

    public static void main(String[] args) {
        int num = StaticCheck.getFive();
        System.out.println("Num: " + num);

        StaticCheck SC = new StaticCheck();
        int num2 = SC.getFive();

        System.out.println("Num2: " + num2);
    }
}
