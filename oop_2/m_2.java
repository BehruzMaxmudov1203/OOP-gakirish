package oop_2;

public class m_2 {
    public static void main(String[] args) {
        Uchburchak uchburchak = new Uchburchak(3, 4, 5);
        System.out.println("a " + uchburchak.getA());
        System.out.println("b " + uchburchak.getB());
        System.out.println("c " + uchburchak.getC());
        System.out.println(uchburchak.yuza());
        System.out.println(uchburchak.pemetir());
    }
}

class Uchburchak {
    private double a;
    private double b;
    private double c;

    public Uchburchak(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double pemetir() {
        return a + b + c;
    }

    public double yuza() {
        return (a * b) / 2;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public void shovinfo(){
        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("c " + c);
    }
}