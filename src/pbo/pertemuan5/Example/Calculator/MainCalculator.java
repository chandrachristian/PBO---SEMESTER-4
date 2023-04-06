package pbo.pertemuan5.Example.Calculator;

public class MainCalculator {

    public static void main(String[] args) {
        CalculatorScientific obj = new CalculatorScientific();

        CalculatorScientific.akarDua(25);
        CalculatorScientific.tangen(30);

        obj.setNumber1(10);
        obj.setNumber2(20);
        obj.pertambahan();
        obj.pengurangan();
        obj.perkalian(10, 20);
        obj.pembagian();
    }
}
