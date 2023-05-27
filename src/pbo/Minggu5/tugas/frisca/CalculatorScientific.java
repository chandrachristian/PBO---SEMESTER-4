package pbo.Minggu5.tugas.frisca;

public class CalculatorScientific {

    void akarDua (int number){
        double dua = Math.sqrt(number);
        System.out.println("Hasil nilai akhir " + dua);    
    }

    double pangkat (int x, int y){
        return Math.pow(x, y);
    }
    
    void sin (double x){
        double sinvalue = Math.sin(Math.toRadians(x));
        System.out.println("Hasil sin " + sinvalue);
    }
}