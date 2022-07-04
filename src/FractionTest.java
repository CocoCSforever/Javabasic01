import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testEquals() {
        Fraction fraction1 = new Fraction(2,3);
        Fraction fraction2 = new Fraction(2,3);

        assertEquals(fraction1, fraction2);

        fraction1= new Fraction(3,5);
        fraction2=new Fraction(4,6);

        assertNotEquals(fraction1, fraction2);
    }
}