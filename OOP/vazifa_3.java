package OOP;

public class vazifa_3 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Behruz";
        person.family = "Maxmudov";
        person.age = 21;
        person.address = "Surxondaryo";
        person.informatsiya();
    }
}

class Person {
    String name;
    String family;
    int age;
    String address;

    public void informatsiya() {
        System.out.println("name " + name + " familia " + family +
                " age " + age + " address  " + address);
    }
}
