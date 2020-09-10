public class Bitwise {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int c = a | b;
        System.out.println("C = " + c);

        int d = a & b;
        System.out.println("d = " + d);

        int e = a^b;
        System.out.println("e = " + e);
        System.out.println((~a&b)|(a&~b));

        int i = 0x0f;
        System.out.println(i);

        System.out.println(~a&0x0f);
    }


}
