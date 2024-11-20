package OOP;

// Encapsulation: Person class
public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

// Inheritance: Student class
class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}

// Inheritance: Staff class
class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
}
class Main {
    public static void main(String[] args) {
        // Person obyektini yaratish
        Person shaxs = new Person("Jongi Do'st", "123 Asosiy ko'cha");
        System.out.println("Shaxs: " + shaxs.getName() + ", " + shaxs.getAddress());

        // Student obyektini yaratish
        Student oquvchi = new Student("Jyenklar Smit", "456 Manzil ko'cha", "Kompyuter fani", 2, 5000.0);
        System.out.println("O'quvchi: " + oquvchi.getName() + ", " + oquvchi.getAddress() + ", " +
                oquvchi.getProgram() + ", " + oquvchi.getYear() + ", " + oquvchi.getFee());

        // Staff obyektini yaratish
        Staff xodim = new Staff("Bub Jonson", "789 Elm ko'cha", "XYZ Universiteti", 70000.0);
        System.out.println("Xodim: " + xodim.getName() + ", " + xodim.getAddress() + ", " +
                xodim.getSchool() + ", " + xodim.getPay());
    }
}