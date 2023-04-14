package personaTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

import persona.Persona;
class PersonaTest {
// AssertionError error = Assertions.
    @org.junit.jupiter.api.Test
    public void test1() {
    	Assertions.assertThrows(AssertionError.class, () -> {
    		Persona p = new Persona(-1);
    		p.isMayorDeEdad();
    	});
    }

    @org.junit.jupiter.api.Test
    public void test2() {
    	Assertions.assertThrows(AssertionError.class, () -> {
    		Persona p = new Persona(-100);
    		p.isMayorDeEdad();
    	});
    }

    @org.junit.jupiter.api.Test
    public void test3() {
        Persona p = new Persona(0);
        assertFalse(p.isMayorDeEdad());
    }

    @org.junit.jupiter.api.Test
    public void test4() {
        Persona p = new Persona(17);
        assertFalse(p.isMayorDeEdad());
    }
    
    @org.junit.jupiter.api.Test
    public void test5() {
        Persona p = new Persona(18);
        assertTrue(p.isMayorDeEdad());
    }
    
    @org.junit.jupiter.api.Test
    public void test6() {
        Persona p = new Persona(100);
        assertTrue(p.isMayorDeEdad());
    }
}