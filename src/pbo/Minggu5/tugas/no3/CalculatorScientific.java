package pbo.Minggu5.tugas.no3;

public class CalculatorScientific extends CalculatorStandar {

    static void akarDua(int number) {
        double dua = Math.sqrt(number);
        System.out.println("number : " + dua);
    }

    static void tangen(int number2) {
        double tan = Math.tan(number2);
        System.out.println("number : " + tan);
    }

}