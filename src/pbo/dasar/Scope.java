package pbo.dasar;

public class Scope {
    public static void main(String[] args) {
        sayHello("Chandra");
        sayHello("");
    }

    static void sayHello(String name){
        String hello = "Hello " + name;

        if (!name.isBlank()) {
            System.out.println("Hi " + name);
        }

        System.out.println(hello);
    }
}
