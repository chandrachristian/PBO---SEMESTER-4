package pbo.pertemuan4.Example1;

public class Main {
    public static void main(String[] args) {
        Person pertama = new Person();
        pertama.setName("Chandra");
        pertama.age = 20;

        System.out.println("Name " + pertama.getName());
        System.out.println("Age " + pertama.getAge());
    }
}
