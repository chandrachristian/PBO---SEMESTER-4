package Diskusi;

public class InheritanceB extends InheritanceA {
    public InheritanceB(){
        System.out.println("Hello");
    }
    void welcome() {
        System.out.println("Kami Ada 6");
    }
    
    void truk (){
        super.mobil("Hino", 10);
    }
}
