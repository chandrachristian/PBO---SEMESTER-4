package pbo.dasar;

public class SwitchYield {
    public static void main(String[] args) {

        var nilai = "C";

        String ucapan = switch (nilai) {
            case "A":
                yield "Anda Lulus";
            case "B", "C":
                yield "Anda Lulus Baik";
            case "D":
                yield "Anda Lulus Cukup Baik";
            default:
                yield "Anda Salah jurusan";
        };

        System.out.println(ucapan);
    }
}