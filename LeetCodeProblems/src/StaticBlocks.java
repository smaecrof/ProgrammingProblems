public class StaticBlocks {
    static int a = 12;
    static int b;

    static public void getStatic(){
        System.out.println("Static method running");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static{
        b = 45;
    }

    public static void main(String[] args) {
        StaticBlocks.getStatic();
    }
}
