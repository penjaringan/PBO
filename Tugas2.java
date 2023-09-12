class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    @Override  //overriding dari metode di kelas induk
    void display() {
        System.out.println("This is a circle");  //Merubah pesan output yang sesuai
    }
}

public class Tugas2 {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.display();
    }
}
