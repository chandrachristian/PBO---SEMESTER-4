package pbo.pertemuan4.Example1;

public class MainCalculate {
    public static void main(String[] args) {
        Calculate access = new Calculate();

        access.welcome("Chandra");

        access.number1 = 8;
        access.number2 = 5;
        System.out.println("The Result 8 added by 5 equals to " + access.additionNumber());
        System.out.println("The Result 8 kurang by 5 equals to " + access.kurangNumber());
        System.out.println("The Result 8 kali by 5 equals to " + access.kaliNumber());

        int resultAdd = access.additionNumber();
        System.out.println("-------- Result 8 added by 5 equals to " + resultAdd);

        access.substractionNumber(7, 3);
    }
}
