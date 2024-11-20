package Polymorphism;

public class m_1 {

    // Ikkita sonni yig'indisini qaytaradi
    public double add(double a, double b) {
        return a + b;
    }

    // Ikkita butun sonni yig'indisini qaytaradi (overloading)
    public int add(int a, int b) {
        return a + b;
    }

    // Ikkita sonni ayirmasini qaytaradi
    public double sub(double a, double b) {
        return a - b;
    }

    // Ikkita butun sonni ayirmasini qaytaradi (overloading)
    public int sub(int a, int b) {
        return a - b;
    }

    // Ikkita sonni ko'paytmasini qaytaradi
    public double multiply(double a, double b) {
        return a * b;
    }

    // Ikkita butun sonni ko'paytmasini qaytaradi (overloading)
    public int multiply(int a, int b) {
        return a * b;
    }

    // Ikkita sonni bo'linmasini qaytaradi
    public double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Bo'linuvchi 0 bo'lmasligi kerak.");
        }
        return a / b;
    }

    // Ikkita butun sonni bo'linmasini qaytaradi (overloading)
    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Bo'linuvchi 0 bo'lmasligi kerak.");
        }
        return a / b;
    }

    // Bitta sonning absolyut qiymatini qaytaradi
    public double abs(double a) {
        return Math.abs(a);
    }

    // Bitta sonning kvadrat qiymatini qaytaradi
    public double pow(double a) {
        return a * a;
    }

    public static void main(String[] args) {
        m_1 mathFunctions = new m_1();

        // Misollar
        System.out.println("Yig'indi (double): " + mathFunctions.add(5.5, 3.3));
        System.out.println("Yig'indi (int): " + mathFunctions.add(5, 3));

        System.out.println("Ayirma (double): " + mathFunctions.sub(5.5, 3.3));
        System.out.println("Ayirma (int): " + mathFunctions.sub(5, 3));

        System.out.println("Ko'paytma (double): " + mathFunctions.multiply(5.5, 3.3));
        System.out.println("Ko'paytma (int): " + mathFunctions.multiply(5, 3));
        System.out.println("Bo'linma (double): " + mathFunctions.div(5.5, 2.0));
        System.out.println("Bo'linma (int): " + mathFunctions.div(5, 2));

        System.out.println("Absolyut: " + mathFunctions.abs(-5));
        System.out.println("Kvadrat: " + mathFunctions.pow(5));

    }
}