package Inheritance_mavzusi;

public class m_2 {
    public static void main(String[] args) {
        // Sinflardan ob'yektlar yaratamiz
        PC pc = new PC();
        Laptop laptop = new Laptop();
        Subwoofer subwoofer = new Subwoofer();
        Loudspeaker loudspeaker = new Loudspeaker();

        // Ob'yektlarning xususiyatlarini belgilaymiz
        pc.setBrand("Dell");
        pc.setModel("Inspiron 3501");
        pc.setProcessor("Intel Core i5");
        pc.setRam(8);
        pc.setStorage(256);

        laptop.setBrand("Asus");
        laptop.setModel("ZenBook Pro Duo");
        laptop.setProcessor("Intel Core i7");
        laptop.setRam(16);
        laptop.setStorage(512);

        subwoofer.setBrand("Klipsch");
        subwoofer.setModel("R-10SW");
        subwoofer.setVolume(100);
        subwoofer.setFrequency(40);
        subwoofer.setPower(200);

        loudspeaker.setBrand("JBL");
        loudspeaker.setModel("LSR305");
        loudspeaker.setVolume(80);
        loudspeaker.setFrequency(60);
        loudspeaker.setPower(150);

        // Ob'yektlar haqida ma'lumotlarni chop etamiz
        System.out.println("PC: Brand - " + pc.getBrand() + ", Model - " + pc.getModel() + ", Processor - " + pc.getProcessor() + ", RAM - " + pc.getRam() + "GB, Storage - " + pc.getStorage() + "GB");
        System.out.println("Laptop: Brand - " + laptop.getBrand() + ", Model - " + laptop.getModel() + ", Processor - " + laptop.getProcessor() + ", RAM - " + laptop.getRam() + "GB, Storage - " + laptop.getStorage() + "GB");
        System.out.println("Subwoofer: Brand - " + subwoofer.getBrand() + ", Model - " + subwoofer.getModel() + ", Volume - " + subwoofer.getVolume() + ", Frequency - " + subwoofer.getFrequency() + "Hz, Power - " + subwoofer.getPower() + "W");
        System.out.println("Loudspeaker: Brand - " + loudspeaker.getBrand() + ", Model - " + loudspeaker.getModel() + ", Volume - " + loudspeaker.getVolume() + ", Frequency - " + loudspeaker.getFrequency() + "Hz, Power - " + loudspeaker.getPower() + "W");
    }
}

// Electronics (Elektronika) sinfi
class Electronics {
    private String brand; // Elektronika brendi
    private String model; // Elektronika modeli
    private double price; // Elektronika narxi

    // Elektronika brendi, modeli va narxini o'rnatish uchun setter metodlar
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public double getPrice() {
        return this.price;
    }
}

class Computers extends Electronics {
    private String processor;
    private int ram;
    private int storage;

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getProcessor() {
        return this.processor;
    }

    public int getRam() {
        return this.ram;
    }

    public int getStorage() {
        return this.storage;
    }
}


class PC extends Computers {
    // PC sinfi uchun qo'shimcha xususiyatlari yo'q
    // Computers sinfidan barcha xususiyatlarni meros oladi
}


class Laptop extends Computers {
    // Laptop sinfi uchun qo'shimcha xususiyatlari yo'q
    // Computers sinfidan barcha xususiyatlarni meros oladi
}

// Sounds (Ovozlar) sinfi
class Sounds extends Electronics {
    private int volume; // Ovoz balandligi
    private int frequency; // Ovoz chastotasi
    private int power; // Ovoz quvvati

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setPower(int power) {
        this.power = power;
    }


    public int getVolume() {
        return this.volume;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public int getPower() {
        return this.power;
    }
}


class Subwoofer extends Sounds {

}


class Loudspeaker extends Sounds {

}