// Kelas Main tetap sama
public class Tugas1 {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound(); // Output: Dog barks
        animal2.makeSound(); // Output: Cat meows
    }
}
// Kelas Animal tetap sama
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Perubahan 1: Meng-override metode makeSound() di kelas Dog
class Dog extends Animal {
    @Override  // Penambahan anotasi @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Perubahan 2: Metode makeSound() di kelas Cat sebenarnya sudah benar,
// tetapi kita tambahkan anotasi @Override untuk kejelasan.
class Cat extends Animal {
    @Override  // Penambahan anotasi @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
