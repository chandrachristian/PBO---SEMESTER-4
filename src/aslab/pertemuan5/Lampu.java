package aslab.pertemuan5;

public class Lampu implements interfaceLampu {
    int statusLampu;

    public void hidupkan() {
        if (statusLampu == KEADAAN_MATI) {
            statusLampu = KEADAAN_HIDUP;
            System.out.println("Hidupkan lampu! --> Lampu Hidup");
        } else {
            System.out.println("Hidupkan lampu! --> Lampu sudah hidup kok");
        }
    }

    public void matikan() {
        if (statusLampu == KEADAAN_HIDUP) {
            statusLampu = KEADAAN_MATI;
            System.out.println("Matikan lampu! --> Lampu Matikan");
        } else {
            System.out.println("Matikan lampu! --> Lampu sudah matikan kok");
        }
    }
}
