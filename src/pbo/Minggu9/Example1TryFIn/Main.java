package pbo.Minggu9.Example1TryFIn;

public class Main {
    public static void main(String[] args) {
        try {
            // code that generated exceotion
            int divideByZero = 5/0;
            System.out.println("Rest of code in try block");
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("ArithmeticException: " + e.getMessage());
            System.out.println("A");
        }
    }
}
