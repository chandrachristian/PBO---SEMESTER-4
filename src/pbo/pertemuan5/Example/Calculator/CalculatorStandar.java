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

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    void pertambahan() {
        int result = number1 + number2;
        System.out.println("Hasil Pertambahan " + number1 + " + " + number2 + "\t: " + result);
    }

    void pengurangan() {
        int result = number1 - number2;
        System.out.println("Hasil Pengurangan " + number1 + " - " + number2 + "\t: " + result);
    }

    int perkalian(int a, int b) {
        setNumber1(a);
        setNumber2(b);
        int result = a * b;
        System.out.println("Hasil Perkalian " + number1 + " * " + number2 + "\t\t: " + result);
        return result;
    }

    int pembagian() {
        int result = number1 / number2;
        System.out.println("Hasil Pembagian " + number1 + " / " + number2 + "\t\t: " + result);
        return result;
    }
}
