package pbo.pertemuan5.Example.Calculator;

public class CalculatorStandar {
    private int number1;
    private int number2;

    void setNumber1(int a) {
        number1 = a;
    }

    void setNumber2(int b) {
        number2 = b;
    }

    void pertambahan() {
        int result = number1 + number2;
        System.out.println("Hasil : " + result);
    }

    void pengurangan() {
        int result = number1 - number2;
        System.out.println("Hasil : " + result);
    }

    int perkalian(int a, int b) {
        int result = a * b;
        System.out.println("Hasil : " + result);
        return result;
    }

    int pembagian() {
        int result = number1 / number2;
        System.out.println("Hasil : " + result);
        return result;
    }
}
