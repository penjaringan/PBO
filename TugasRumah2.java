class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class TugasRumah2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.makeSound();  // Memanggil method makeSound() dari kelas Animal
        dog.makeSound();     // Memanggil method makeSound() dari kelas Dog (override)
        cat.makeSound();     // Memanggil method makeSound() dari kelas Cat (override)
    }
}
