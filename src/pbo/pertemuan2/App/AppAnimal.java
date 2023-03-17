package pbo.pertemuan2.App;

import pbo.pertemuan2.Abstract.Animal;
import pbo.pertemuan2.Abstract.Cat;

public class AppAnimal {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = " Puss";
        animal.run();
    }
}
