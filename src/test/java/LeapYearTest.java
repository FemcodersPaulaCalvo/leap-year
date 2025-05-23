import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

//Deben cumplirse todas las siguientes normas:
//
//Un año no es bisiesto si no es divisible por 4
//Un año es bisiesto si es divisible por 4
//Un año es bisiesto si es divisible por 400
//Un año no es bisiesto si es divisible por 100 pero no por 400
//Ejemplos:
//
//1997 no es bisiesto (no es divisible por 4)
//1996 es bisiesto (divisible por 4)
//1600 es bisiesto (divisible por 400)
//1800 no es bisiesto (divisible por 4, divisible por 100, NO divisible por 400)
//El método debe devolver 'true' si un año es bisiesto, y 'false' si no lo es.

public class LeapYearTest {
    @Test
    void shouldReturnFalseWhenInputIs1997(){
        assertFalse(NewYear.isLeap(1997));
    }

    @Test
    void shouldReturnTrueWhenInputIs1996(){
        assertTrue(NewYear.isLeap(1996));
    }

    @Test
    void shouldReturnTrueWhenInputIs1600(){
        assertTrue(NewYear.isLeap(1600));
    }

    @Test
    void shouldReturnFalseWhenInputIs1800(){
        assertFalse(NewYear.isLeap(1800));
    }
}
