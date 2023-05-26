package pbo.Minggu4.Example1;

public class Calculate {
    int number1;
    int number2;

    void welcome(String name) {
        System.out.println("Welcome to the calculation program");
        System.out.println("Created by " + name);
    }

    int additionNumber() {
        int result = number1 + number2;
        return result;
    }

    int kurangNumber() {
        int result = number1 - number2;
        return result;
    }

    int kaliNumber() {
        int result = number1 * number2;
        return result;
    }

    void substractionNumber(int var1, int var2) {
        // store var1 to internal methode variable
        int internal_number1 = var1;

        int result = internal_number1 - var2;
        System.out.println("The Result " + var1 + " - " + var2 + " is " + result);
    }
}
