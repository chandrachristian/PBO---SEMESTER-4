package aslab.pertemuan5;

public class LampuBeraksi {
    public static void main(String[] args) {
        Lampu lampuKamar = new Lampu();

        System.out.println("Status lampu saat ini: mati");

        lampuKamar.hidupkan(); // Hidupkan lampu
        lampuKamar.matikan(); // Matikan lampu
        lampuKamar.matikan(); // Matikan lampu
        lampuKamar.hidupkan(); // Hidupkan lampu
        lampuKamar.hidupkan(); // Hidupkan lampu
    }
}
