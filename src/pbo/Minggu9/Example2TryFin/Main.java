package pbo.Minggu9.Example2TryFin;

public class Main {
    public static void main(String[] args) {
        try {
            // Code that generate exception
            int divideByZero = 5/0;
        } catch (ArithmeticException e) {
            // TODO: handle bexception
            System.out.println("ArithmeticException => " + e.getMessage());
        }
        finally {
            System.out.println("This is the Finally block");
        }
    }
}
