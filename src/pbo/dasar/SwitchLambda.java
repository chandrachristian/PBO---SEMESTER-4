package pbo.dasar;

public class SwitchLambda {
    public static void main(String[] args) {

        String nilai = "E";

        switch (nilai) {
            case "A" -> System.out.println("Anda Lulus");
            case "B", "C" -> System.out.println("Anda Lulus Baik");
            case "D" -> System.out.println("Anda Lulus Cukup Baik");
            default -> {
                System.out.println("Anda Salah jurusan");
            }
        }
    }
}
