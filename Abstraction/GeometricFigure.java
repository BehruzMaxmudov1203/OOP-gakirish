package Abstraction;


abstract class GeometricFigure {

    private String color;

    public GeometricFigure(String color) {
        this.color = color;
    }


    public abstract double area();


    public abstract void draw();


    public String getColor() {
        return color;
    }
}


class Circle extends GeometricFigure {
    private double radius; // Inkapsulyatsiya

    public Circle(String color, double radius) {
        super(color); // Super konstruktorni chaqirish
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius; // Yuqori metodni amalga oshirish
    }

    @Override
    public void draw() {
        System.out.println("Chizilayotgan doira: " + getColor() + " rangdagi, radiusi " + radius);
    }
}

// Rectangle klassi GeometricFigure dan meros oladi
class Rectangle extends GeometricFigure {
    private double width; // Inkapsulyatsiya
    private double height; // Inkapsulyatsiya

    public Rectangle(String color, double width, double height) {
        super(color); // Super konstruktorni chaqirish
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height; // Yuqori metodni amalga oshirish
    }

    @Override
    public void draw() {
        System.out.println("Chizilayotgan to'rtburchak: " + getColor() + " rangdagi, kengligi " + width + " va balandligi " + height);
    }
}

// Asosiy klass
class Main{
    public static void main(String[] args) {
        GeometricFigure circle = new Circle("qizil", 5);
        GeometricFigure rectangle = new Rectangle("ko'k", 4, 6);

        System.out.println("Doiraning maydoni: " + circle.area());
        circle.draw();

        System.out.println("To'rtburchakning maydoni: " + rectangle.area());
        rectangle.draw();
    }
}