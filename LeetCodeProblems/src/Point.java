

public class Point {
    int m_x, m_y;

    public Point(int x, int y) { m_x = x; m_y = y; }
    public Point() { this(10, 10); }
    public int getX() { return m_x; }
    public int getY() { return m_y; }

    public static void main(String args[]) {
        java.awt.Point p = new java.awt.Point();
        System.out.println(p.getX());
    }
}
