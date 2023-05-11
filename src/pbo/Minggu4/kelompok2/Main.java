package Minggu4.kelompok2;

public class Main {
    public static void main(String[] args) {

        Buah apel = new Buah();

        // Setter(menulis)
        apel.setBeratBuah("10 kilo");
        apel.setKondisi("baik");

        // Getter(membaca)
        apel.getBeratBuah();
        System.out.println("berat buah : " + apel.getBeratBuah());
        apel.getKondisi();
        System.out.println("kondisi buah : " + apel.getKondisi());
    }
}
