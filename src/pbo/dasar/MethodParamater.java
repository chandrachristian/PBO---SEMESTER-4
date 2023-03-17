package pbo.dasar;

public class MethodParamater {

    public static void main(String[] args) {

        sayHello("Chandra","Christian");
        sayHello("Inez","Zahra");
        sayHello("Chandra","Christian");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
