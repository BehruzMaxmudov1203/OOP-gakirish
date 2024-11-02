package oop_2;

public class m_3 {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2, 3);
        Point point2 = new Point(4, 5, 6); // Ikkinchi nuqta qo'shamiz

        System.out.println("Ayirish natijasi: " + point1.addayirish(point2));
        System.out.println("Qo'shish natijasi: " + point1.addqoshish(point2));
        System.out.println("Uzunlik: " + point1.uzunlik());
        System.out.println("X: " + point1.getX());
        System.out.println("Y: " + point1.getY());
        System.out.println("Z: " + point1.getZ());
    }
}

class Point {
    private double x; // X koordinata
    private double y; // Y koordinata
    private double z; // Z koordinata

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Vektor uzunligini hisoblash
    public double uzunlik() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // Vektorlarni qo'shish
    public Point addqoshish(Point point) {
        return new Point(this.x + point.x, this.y + point.y, this.z + point.z);
    }

    // Vektorlarni ayirish
    public Point addayirish(Point point) {
        return new Point(this.x - point.x, this.y - point.y, this.z - point.z);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}