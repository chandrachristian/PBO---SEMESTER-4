package pbo.dasar;

public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "E";

        switch (nilai) {
            case "A":
                System.out.println("Anda Lulus dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus dengan cukup Baik");
                break;
            case "D":
                System.out.println("Anda Tidak lulus");
                break;
            default:
                System.out.println("Anda salah jurusan");
        }
    }
}
