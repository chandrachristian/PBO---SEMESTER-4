package pbo.dasar;

public class TerneryOperator {

    public static void main(String[] args) {

        // Tanpa ternery operator

        int nilai = 70;
        String ucapan;

        // if(nilai >= 75){
        // ucapan = "Selamat anda lulus";
        // } else {
        // ucapan = "Anda tidak lulus";
        // }

        // System.out.println(ucapan);

        // Dengan ternery operator

        ucapan = nilai >= 75 ? "Selamat anda lulus 1" : "Anda tidak lulus";

        System.out.println(ucapan);
    }

}
