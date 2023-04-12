package pbo.pertemuan5.tugas.frisca;

public class CalculatorStandar {
    private double number1;
    private double number2;

    void setNumber1 (double a){
        number1=a;
    }
    void setNumber2 (double b){
        number2=b;
    }
    double getNumber1 (){
        return number1;
    }
    double getNumber2 (){
        return number2;
    }
    void pertambahan (){
        double result = number1 + number2;
        System.out.println("hasil dari pertambahan adalah = " + result);
    }
    void pengurangan (){
        double result =number1 - number2;
        System.out.println("hasil dari pengurangan adalah = " + result);
    }
    double perkalian(double a, double b) {
            double result = a * b;
            return result;
    }
    
    double pembagian() {
            double result = number1 / number2;
            return result;
    }
    
}
