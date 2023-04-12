package pbo.pertemuan5.tugas.frisca;

public class MainCal {
    public static void main (String[]example) {

        CalculatorStandar cal = new CalculatorStandar();
        CalculatorScientific objkal = new CalculatorScientific();

        objkal.akarDua(25);
        objkal.pangkatDua(10,2);

        cal.setNumber1(20);
        cal.setNumber2(20);

        cal.pertambahan();
        cal.pengurangan();
        System.out.println("hasil dari perkalian adalah = " + cal.perkalian(cal.getNumber1(), cal.getNumber2()));
        System.out.println("hasil dari pembagian adalah = " + cal.pembagian());
    }
    
}