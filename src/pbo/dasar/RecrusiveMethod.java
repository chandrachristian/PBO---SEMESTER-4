package pbo.dasar;

public class RecrusiveMethod {
    public static void main(String[] args) {
        /* Menggunakan Perulangan */
        System.out.println(factorialLoop(5));

        /* Menggunakan Recrusive */
        System.out.println(factorialRecrusive(5));

        loop(100);
    }

    static int factorialLoop(int value) {
        var result = 1;

        for (var counter = 1; counter <= value; counter++) {
            result *= counter;
        }

        return result;
    }

    static int factorialRecrusive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecrusive(value - 1);
        }
    }

    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop" + value);
            loop(value - 1);
        }
    }
}
