package pbo.dasar;

public class Variable {

    public static void main(String[] args) {

        String name;
        name = "Chandra Christian";

        System.out.println(name);

        int age = 30;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Cahya Kamila Wilujeng";
        System.out.println(name);

        var firstname = "Chandra";
        var middlename = "Christian";
        var lastname = "Siregar";

        System.out.println(firstname + " " + middlename + " " + lastname);

        final String fullname = "Chandra Christian";

        System.out.println(fullname);
    }
}
