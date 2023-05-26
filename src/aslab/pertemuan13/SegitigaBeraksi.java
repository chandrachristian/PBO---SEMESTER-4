package aslab.pertemuan13;

class Segitiga {
    private int lebar;

    public Segitiga(int lebar) {
        this.lebar = lebar;
    }

    public String gambarSegitiga() {
        String r = "";
        for (int i = 1; i <= lebar; i++) {
            for (int j = 1; j <= i; j++)
                r = r + "[]";
            r = r + "\n";
        }
        return r;
    }
}

public class SegitigaBeraksi {
    public static void main(String[] args) {
        Segitiga kecil = new Segitiga(5);
        System.out.println(kecil.gambarSegitiga());
        Segitiga besar = new Segitiga(15);
        System.out.println(besar.gambarSegitiga());
    }
}
