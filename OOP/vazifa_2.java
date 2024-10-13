package OOP;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class vazifa_2 {
    public static void main(String[] args) {
        Uchburchak u = new Uchburchak();
        u.a = 3;
        u.b = 4;
        System.out.println(u.gipoteza());
        System.out.println(u.peremetr());
    }
}

class Uchburchak {
    double a;
    double b;

    public double gipoteza() {
        return Math.sqrt(a * a + b * b);
    }

    public double peremetr() {
        return a + b + gipoteza();
    }

    public void informatsiya() {
        System.out.println("a " + a + " b " + b);
        System.out.println(peremetr());
        System.out.println(gipoteza());
    }
}
