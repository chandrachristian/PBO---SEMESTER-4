package pbo.pertemuan5.tugas.frisca;

public class CalculatorScientific {
    public void akarDua(int number) {
        double dua = Math.sqrt(number);
        System.out.println("Akar = " + dua);
    }
    void pangkatDua(int pangkat, int dua){
        double hasil = Math.pow(pangkat, dua);
        System.out.println(pangkat + " pangkat dua" + dua + " adalah = " + hasil);
    }
    
   
}