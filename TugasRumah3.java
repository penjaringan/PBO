class Shape {
    double calculateArea() {
        return 0; // Nilai sementara, kelas anak akan meng-override metode ini
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class TugasRumah3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        double rectangleArea = rectangle.calculateArea();
        System.out.println("Luas Persegi: " + rectangleArea);

        double circleArea = circle.calculateArea();
        System.out.println("Luas Lingkaran: " + circleArea);
    }
}
