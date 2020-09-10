/*
- Java code to demonstrate how to draw a circle without floating point arithmetic
 */
public class DrawCircle {
    public static void main(String[] args) {
        drawCircle(8);
    }

    public static void drawCircle(int r){
        // Consider a rectangle of size N*N
        int N = 2*r + 1;

        int x,y; // Coordinates inside of the rectangle

        // Draw a square of size N*N
        for (int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                // Start from the left most corner point
                x = i-r;
                y = j-r;

                // If the point is instide the circle, print it
                if(x*x + y*y <= r*r+1)
                    System.out.print('.');
                else
                    System.out.print(' ');

                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
