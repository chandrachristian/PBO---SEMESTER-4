package pbo.Minggu6.ExampleOverriding;

public class CalculatorScientific extends CalculatorStandar {

    void welcome() {
        System.out.println("Hello World Calculator Scientific");
    }

    // tambahan

    void additionNumber() {
        super.addNumber(10, 5);
    }
}
