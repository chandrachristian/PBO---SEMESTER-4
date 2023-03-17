package pbo.dasar;

public class MembuatArray {

    public static void main(String[] args) {

        String[] stringArray = new String[3];

        stringArray[0] = "Chandra";
        stringArray[1] = "Christian";
        stringArray[2] = "Siregar";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        String[] namaNama = {
                "Chandra", "Christian", "Siregar"
        };

        namaNama[0] = null;

        int[] arrayInt = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        arrayLong[0] = 0;

        System.out.println(namaNama.length);

        String[][] members = {
                { "Chandra", "Christian" },
                { "Chandra", "Christian" },
                { "Siregar" }
        };

        System.out.println(members[0][0] + " Kelas " + members[1][0]);
    }
}
