class Vehicle {
    void displayInfo() {
        System.out.println("This is a vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    void displayInfo() {
        System.out.println("This is a car.");
    }
}

class Bike extends Vehicle {
    @Override
    void displayInfo() {
        System.out.println("This is a bike.");
    }
}

public class TugasRumah1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bike bike = new Bike();

        vehicle.displayInfo();  // Memanggil method displayInfo() dari kelas Vehicle
        car.displayInfo();      // Memanggil method displayInfo() dari kelas Car (sudah override)
        bike.displayInfo();     // Memanggil method displayInfo() dari kelas Bike (sudah override)
    }
}
