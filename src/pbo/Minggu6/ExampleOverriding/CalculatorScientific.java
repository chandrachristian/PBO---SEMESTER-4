package Minggu6.ExampleOverriding;

public class CalculatorScientific extends CalculatorStandar {
    
    void welcome() {
        System.out.println("Hello World Calculator Scientific");
    }

    void additionNumber() {
        super.addNumber(10, 5);
    }
}
