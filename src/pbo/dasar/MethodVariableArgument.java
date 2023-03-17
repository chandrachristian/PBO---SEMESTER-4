package pbo.dasar;

public class MethodVariableArgument {

    public static void main(String[] args) {
        /* Tidak memakai variable argument */

        int[] values = { 80, 80, 80, 80, 80 };
        sayCongrats("Chandra", values);

        /* Memakai variable argument */
        sayCongrats("Chandra", 80, 80, 50, 50, 50);
    }

    static void sayCongrats(String nama, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75) {

            System.out.println("Selamat " + nama + " Anda Lulus");
        } else {
            System.out.println("Maaf " + nama + " Anda Tidak Lulus");
        }
    }
}
