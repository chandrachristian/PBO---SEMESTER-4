package TugaKelompok.polymorphism;

// POLIMORPISME MENGGUNAKAN INHERITANCE
class Hewan {
    void makan() {
        System.out.println("\n|--Makanan Hewan--|\n");
    }
}

class Herbivora extends Hewan {
    @Override
    void makan() {
        super.makan();
        System.out.println(">> Herbivora Memakan Tumbuhan");
    }
}

class Karnivora extends Hewan {
    @Override
    void makan() {
        super.makan();
        System.out.println(">> Karnivora Memakan Daging");
    }
}

class Omnivora extends Hewan {
    @Override
    void makan() {
        super.makan();
        System.out.println(">> Omnivora Memakan Tumbuhan dan Daging\n");
    }
}

public class Overriding {
    public static void main(String[] args) {

        Hewan h = new Herbivora();
        Hewan k = new Karnivora();
        Hewan o = new Omnivora();

        h.makan();
        k.makan();
        o.makan();
    }
}