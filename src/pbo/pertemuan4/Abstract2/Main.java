package pbo.pertemuan4.Abstract2;

public class Main {
    public static void main(String[] args) {
        Shape segitiga = new Triangle(4, 5);
        Shape lingkaran = new Circle(10);

        System.out.println("Triangle Area " + segitiga.getArea());
        System.out.println("Circle Area " + lingkaran.getArea());

    }
}
