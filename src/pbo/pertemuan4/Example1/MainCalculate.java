package pbo.pertemuan4.Example1;

public class MainCalculate {
    public static void main(String[] args) {
        Calculate access = new Calculate();

        access.welcome("Chandra");

        access.number1 = 8;
        access.number2 = 5;
        System.out.println("The Result 8 added by 5 equals to " + access.additionNumber());

        access.substractionNumber(7, 3);
    }
}
