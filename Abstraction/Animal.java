package Abstraction;


abstract class Animal {

    private String name;
    private int age;

    // Konstruktor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public abstract void makeSound();


    public abstract void displayInfo();


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }
}

// Dog klassi Animal dan meros oladi
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age); // Super konstruktorni chaqirish
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " havlaydi!");
    }

    @Override
    public void displayInfo() {
        System.out.println("It: " + getName() + ", Yosh: " + getAge());
    }
}

// Cat klassi Animal dan meros oladi
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age); // Super konstruktorni chaqirish
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " miyiqlaydi!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Mushuk: " + getName() + ", Yosh: " + getAge());
    }
}

// Asosiy klass
class Main1 {
    public static void main(String[] args) {
        Animal dog = new Dog("Bobik", 3);
        Animal cat = new Cat("Mushi", 2);

        dog.makeSound();
        dog.displayInfo();

        cat.makeSound();
        cat.displayInfo();
    }
}