package TugaKelompok.polymorphism;

// POLIMORPISME MENGGUNAKAN INTERFACE
interface Notifikasi {
    void kirimPesan();
}

class Email implements Notifikasi {
    @Override
    public void kirimPesan() {
        System.out.println(
                "\nMengirim E-mail ke ihsanbudi@gmail.com dengan isi isi Ayo belajar Java, https://www.java.com\n");

    }
}

class Sms implements Notifikasi {
    @Override
    public void kirimPesan() {
        System.out.println("Mengirim SMS ke 08282276110620  dengan isi isi Ayo belajar Java, https://www.java.com\n");

    }
}

public class Overriding2 {
    public static void main(String[] args) {

        Notifikasi emailNotif = new Email();
        Notifikasi smsNotif = new Sms();

        emailNotif.kirimPesan();
        smsNotif.kirimPesan();
    }
}