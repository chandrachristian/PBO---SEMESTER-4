package Minggu5.tugas.frisca;

public class MainCal {
    public static void main (String[]example) {

        CalculatorStandar foo = new CalculatorStandar();
        CalculatorScientific objkal = new CalculatorScientific();
        
        foo.setNumber1(2);
        foo.setNumber2(20);

        objkal.akarDua(20);
        System.out.println("Hasil pangkat dari : " + objkal.pangkat(20, 2));
        objkal.sin(20);
        foo.pertambahan();
        foo.pengurangan();
        System.out.println("Hasil perkalian dari : " + foo.perkalian(20, 2));
        System.out.println("Hasil pembagian dari : " + foo.pembagian());
    }
    
}