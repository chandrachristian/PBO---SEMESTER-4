package pbo.Minggu4.ContohMinggu3;

//Abstract class
abstract class Car {
    abstract void accelerate();

    void identify() {
        System.out.println("car generally have 4 wheels and 1 streering wheel");
    }

    void maxSpeed() {
        System.out.println("Maximum speed is 100km/hour");
        calculateFuel();
    }

    private void calculateFuel() {
        System.out.println("The average use og car gasoline is 10km/1liter");
    }
}

// Concrete class
class Suzuki extends Car {
    void accelerate() {
        System.out.println("Suzuki::accelerate");
    }
}

public class Main {
    public static void main(String[] args) {
        Car obj = new Suzuki(); // Car object => contents of suzuki
        obj.accelerate(); // call the method
        obj.identify();
        obj.maxSpeed();

    }
}
