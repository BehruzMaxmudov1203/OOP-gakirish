package OOP;

public class vazifa_1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.rangi = "qizil";
        car.model = "malibu";
        car.narxi = 30000;
        car.avto_yoki_mexanik = "mexanik";
        car.informatsiya();
    }
}

class Car {
    String rangi;
    String model;
    int narxi;
    String avto_yoki_mexanik;


    public void informatsiya() {
        System.out.println("rangi " + rangi + " model " + model +
                " narxi " + narxi + " turi " + avto_yoki_mexanik);

    }
}