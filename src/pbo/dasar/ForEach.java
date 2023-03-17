package pbo.dasar;

public class ForEach {

    public static void main(String[] args) {

        String[] nama = {
                "Chandra", "Christian", "Siregar",
                "Cahya", "Kamila", "Wilujeng"
        };

        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i]);
        }

        System.out.println("For Each");

        for (var name : nama) {
            System.out.println(name);
        }
    }
}
