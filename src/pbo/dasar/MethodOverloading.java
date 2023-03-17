package pbo.dasar;

public class MethodOverloading {

    public static void main(String[] args) {

        sayHello();
        sayHello("Chandra");
        sayHello("Chandra", "Christian");
    }

    static void sayHello() {
        System.out.println("Selamat anda lulus");
    }

    static void sayHello(String name) {
        System.out.println("Selamat anda lulus " + name);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Selamat anda lulus " + firstName + " " + lastName);
    }
}
