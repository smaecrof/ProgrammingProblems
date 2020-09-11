public class BreakLabels {
    public static void main(String[] args) {

        outer: for(int i = 0; i < 3; i++){
            System.out.println("Inside Outer");
            inner: for(int j = 0; j < 2; j++){
                System.out.println("Inside inner");
                        break outer;
            }
            System.out.println("backhalf of outer");
        }
        System.out.println("Outside of loop");
    }
}
