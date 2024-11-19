package Polymorphism1;


// Shakl (Shape) klassi: umumiy xususiyatlar va metodlarni belgilaydi
class Shape {
    // Atributlar
    double area;
    double perimeter;

    // Methodlar
    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    // Yuz va perimetrni hisoblash metodlari subclasslar tomonidan o'zgartiriladi
    public void calculateArea() {
        // bu metod override qilinadi
    }

    public void calculatePerimeter() {
        // bu metod override qilinadi
    }
}

// To'rtburchak (Rectangle) klassi: Shape klassidan meros oladi
class Rectangle extends Shape {
    // Atributlar
    private double length;
    private double width;

    // Konstruktor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Yuzni hisoblash metodini override qilish
    @Override
    public void calculateArea() {
        area = length * width;
    }

    // Perimetrni hisoblash metodini override qilish
    @Override
    public void calculatePerimeter() {
        perimeter = 2 * (length + width);
    }
}

// Doira (Circle) klassi: Shape klassidan meros oladi
class Circle extends Shape {
    // Atribut
    private double radius;

    // Konstruktor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Yuzni hisoblash metodini override qilish
    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }

    // Perimetrni hisoblash metodini override qilish
    @Override
    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
    }

}

class Main {
    public static void main(String[] args) {
        // Rectangle obyekti
        Rectangle rectangle = new Rectangle(5, 3);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        // Circle obyekti
        Circle circle = new Circle(4);
        circle.calculateArea();
        circle.calculatePerimeter();
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
    }
}