class Animal {
    private String name;

    public Animal (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String talk() {
        return "Animal talks....";
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return this.getName() + "Miowwws....";
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return this.getName() + "Houv houv....";
    }
}

class Horse extends Animal {

    public Horse(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return this.getName() + "Ihaaa....";
    }
}


public class Main {

    public static void speak(Animal animal) {
        System.out.println(animal.talk());
    }

    public static void main(String[] args) {
        // First preview
        Animal animal = new Animal("Hiper");
        System.out.println(animal.talk());
        Animal animal1 = new Cat("Hiper");
        System.out.println(animal1.talk());
        Animal animal2 = new Dog("Hiper");
        System.out.println(animal2.talk());
        Animal animal3 = new Horse("Hiper");
        System.out.println(animal3.talk());

        // With creating function
        speak(new Cat("Nasip"));
        speak(new Dog("Karabas"));
        speak(new Horse("Bold-Pilot"));
    }
}