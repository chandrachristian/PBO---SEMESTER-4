package pbo.dasar;

public class SwitchTanpaYield {
    public static void main(String[] args) {

        var nilai = "A";
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Anda Lulus";
            case "B", "C" -> ucapan = "Anda Lulus Baik";
            case "D" -> ucapan = "Anda Lulus Cukup Baik";
            default -> ucapan = "Anda Salah jurusan";
        }

        System.out.println(ucapan);
    }
}
