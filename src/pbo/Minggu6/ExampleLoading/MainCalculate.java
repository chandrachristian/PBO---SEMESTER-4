package pbo.Minggu6.ExampleLoading;


public class MainCalculate {
    public static void main(String[] args) {
        Calculate c = new Calculate();

        c.welcome();
        c.welcome("Chandra");
        c.welcome("Minggu6");

        System.out.println("Result 1: " + c.additionNumber(10,5));
        System.out.println("Result 2: " + c.additionNumber(10.5, 5.5));
        
    }
}
