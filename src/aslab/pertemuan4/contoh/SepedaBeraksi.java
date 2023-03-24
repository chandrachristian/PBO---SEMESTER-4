package aslab.pertemuan4.contoh;

public class SepedaBeraksi {
    public static void main(String[] args) {
        Sepeda sepedaku = new Sepeda();

        sepedaku.setGir(1);
        /*
         * Variabel bisa berubah atau tidak sengaja diubah. Hal ini berbahaya dan sering
         * menimbulkan bug. Berikan access modifier private pada instance variable
         */
        // sepedaku.gir = 3;
        System.out.println("Gir saat ini: " + sepedaku.getGir());
    }
}
