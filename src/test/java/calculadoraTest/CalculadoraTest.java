package calculadoraTest;
import static org.junit.jupiter.api.Assertions.*;

import calculadora.Calculadora;
class CalculadoraTest {

    @org.junit.jupiter.api.Test
    public void suma() {
        Calculadora calcu= new Calculadora(2,2);
        int resultado = calcu.suma();
        assertEquals(4,resultado,"Error de la suma");
    }

    @org.junit.jupiter.api.Test
    public void resta() {
        Calculadora calcu= new Calculadora(2,2);
        int resultado = calcu.resta();
        assertEquals(0,resultado,"Error de la resta");
    }

    @org.junit.jupiter.api.Test
    public void multiplica() {
        fail("No implementado");
    }

    @org.junit.jupiter.api.Test
    public void divide() {
        fail("No implementado");
    }
}