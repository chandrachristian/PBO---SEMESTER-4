package Diskusi.Diskusi;

class InheritanceA {
    public void welcome() {
        System.out.println("Kami Ada 5");
    }

    public void welcome(String name) {
        System.out.println("Kami " + name);
    }
}

class InheritanceB extends InheritanceA {
    public InheritanceB() {
        System.out.println("Hello");
    }

    public void welcome() {
        System.out.println("Kami Ada 6");
    }
}

public class Main {
    public static void main(String[] args) {
        InheritanceB objInh = new InheritanceB();
        objInh.welcome();
        objInh.welcome("Kelompok 1");
    }
}
