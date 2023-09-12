public class Poly {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[3];

        fruits[0] = new Apple();
        fruits[1] = new Banana();
        fruits[2] = new Orange();

        for (Fruit fruit : fruits) {
            fruit.consume();
        }
    }
}

class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public void consume() {
        System.out.println("Enjoying the " + name);
    }
}

class Apple extends Fruit {
    public Apple() {
        super("Apple");
    }

    public void consume() {
        System.out.println("Taking a bite of an apple");
    }
}

class Banana extends Fruit {
    public Banana() {
        super("Banana");
    }

    public void consume() {
        System.out.println("Peeling and savoring a banana");
    }
}

class Orange extends Fruit {
    public Orange() {
        super("Orange");
    }

    public void consume() {
        System.out.println("Peeling and relishing an orange");
    }
}
