package Minggu2.App;

import Minggu2.Abstract.Animal;
import Minggu2.Abstract.Cat;

public class AppAnimal {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = " Puss";
        animal.run();
    }
}
