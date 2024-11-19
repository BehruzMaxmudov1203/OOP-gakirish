package Polymorphism1;

class Animal {
    // Atributlar
    private String name;

    // Konstruktor
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void sound() {
        System.out.println("This animal makes a sound");
    }
}


class Dog extends Animal {
    // Konstruktor
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " barks");
    }
}

class Cat extends Animal {
    // Konstruktor
    public Cat(String name) {
        super(name);
    }

    // sound metodini override qilish
    @Override
    public void sound() {
        System.out.println(getName() + " meows");
    }
}

// Parrot (Papagan) klassi: Animal klassidan meros oladi
class Parrot extends Animal {
    // Konstruktor
    public Parrot(String name) {
        super(name);
    }

    // sound metodini override qilish
    @Override
    public void sound() {
        System.out.println(getName() + " squawks");
    }
}

// Asosiy (Main) klassi
class main {
    public static void main(String[] args) {
        // Animal obyekti
        Animal genericAnimal = new Animal("Generic Animal");
        genericAnimal.sound();
        System.out.println("Name: " + genericAnimal.getName());

        // Dog obyekti
        Dog dog = new Dog("Buddy");
        dog.sound();
        System.out.println("Name: " + dog.getName());

        // Cat obyekti
        Cat cat = new Cat("Whiskers");
        cat.sound();
        System.out.println("Name: " + cat.getName());

        // Parrot obyekti
        Parrot parrot = new Parrot("Polly");
        parrot.sound();
        System.out.println("Name: " + parrot.getName());
    }
}
