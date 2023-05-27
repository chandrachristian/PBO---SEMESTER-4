package pbo.Minggu6.ExampleOverriding;

public class CalculatorStandar {

    private int number1;
    private int number2;

    void welcome() {
        System.out.println("Hello world Calculator Standar");
    }

    // tambahan

    void addNumber(int a, int b){
        System.out.println("This is Methode for addition");
        int result = a + b;
        System.out.println("--Result: " + result);
    }
}
