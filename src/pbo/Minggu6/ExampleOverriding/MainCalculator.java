package Minggu6.ExampleOverriding;

public class MainCalculator {
    public static void main(String[] args) {
        // CalculatorScientific objCal = new CalculatorScientific();

        // objCal.welcome();

        // tambahan

        // objCal.additionNumber();

        CalculatorStandar objCal;

        objCal = new CalculatorStandar();
        objCal.welcome();


        objCal = new CalculatorScientific();
        objCal.welcome();
    }
}
