public class Polymorphism {
    public static void main(String[] args) {
        // Membuat array untuk menyimpan objek Fruits.
        Fruit[] fruits = new Fruit[3];

        // Mengisi array dengan objek Fruits dari kelas turunan.
        fruits[0] = new Apple();
        fruits[1] = new Banana();
        fruits[2] = new Orange();

        // Looping melalui array dan memanggil metode 'eat()' pada setiap objek buah.
        for (Fruit fruit : fruits) {
            fruit.eat();
        }
    }
}

// Kelas induk yang merepresentasikan sebuah buah.
class Fruit {
    // Menyimpan nama buah.
    private String name; 

    // Konstruktor untuk inisialisasi nama buah.
    public Fruit(String name) {
        this.name = name;
    }

    // Metode untuk makan buah.
    public void eat() {
        System.out.println("Eating " + name);
    }
}

// Kelas turunan Apple yang mewarisi dari Fruit.
class Apple extends Fruit {
    // Konstruktor untuk inisialisasi nama buah.
    public Apple() {
        super("Apple");
    }

    // Override metode eat() untuk perilaku makan apel.
    public void eat() {
        System.out.println("Eating an apple");
    }
}

// Kelas turunan Banana yang mewarisi dari Fruit.
class Banana extends Fruit {
    // Konstruktor untuk inisialisasi nama buah.
    public Banana() {
        super("Banana");
    }

    // Override metode eat() untuk perilaku makan pisang.
    public void eat() {
        System.out.println("Peeling and eating a banana");
    }
}

// Kelas turunan Orange yang mewarisi dari Fruit.
class Orange extends Fruit {
    // Konstruktor untuk inisialisasi nama buah.
    public Orange() {
        super("Orange");
    }

    // Override metode eat() untuk perilaku makan jeruk.
    public void eat() {
        System.out.println("Peeling and eating an orange");
    }
}
