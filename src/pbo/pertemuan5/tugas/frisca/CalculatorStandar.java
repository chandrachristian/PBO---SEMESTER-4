package pbo.pertemuan5.tugas.frisca;

public class CalculatorStandar {
    private int number1;
    private int number2;

    void setNumber1 (int a){
        number1=a;
    }
    void setNumber2 (int b){
        number2=b;
    }
    void pertambahan (){
        int result = number1 + number2;
        System.out.println("hasil dari pertambahan adalah = " + result);
    }
    void pengurangan (){
        int result =number1 - number2;
        System.out.println("hasil dari pengurangan adalah = " + result);
    }
    int perkalian(int c, int d) {
            int result = c * d;
            return result;
    }
    
    int pembagian() {
            int result = number1 / number2;
            return result;
    }
    
}
