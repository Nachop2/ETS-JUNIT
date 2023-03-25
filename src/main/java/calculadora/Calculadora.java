package calculadora;

public class Calculadora{

    private int num1;
    private int num2;
    public Calculadora(int x, int y){
        num1=x;
        num2=y;
    }
    public int suma() {
        return num1+num2;
    }

    public int resta() {
        return num1-num2;
    }
    public int multiplica() {
        return num1*num2;
    }
    public int divide() {
        return num1/num2;
    }

}
