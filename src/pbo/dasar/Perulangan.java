package pbo.dasar;

public class Perulangan {

    public static void main(String[] args) {

        /*
         * Kondisi
         * 
         * var counter = 1;
         * 
         * for (; counter <= 10;) {
         * System.out.println("Perulangan" + counter);
         * 
         * counter++;
         * }
         */

        /*
         * Kondisi + Init Statement
         * for (var counter = 1; counter <= 10;) {
         * System.out.println("Perulangan" + counter);
         * 
         * counter++;
         * }
         */

        for (var counter = 1; counter <= 10; counter++) {
            System.out.println("Perulangan " + counter);
        }
    }
}
