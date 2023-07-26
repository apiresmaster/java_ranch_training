import e1.Exercise1;
import e1.Exercise1Impl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test extends Exercise1Impl {

    @Test
    void testFixed() {
        Exercise1 evenOrOdd = new Exercise1Impl();

        assertEquals("Even", evenOrOdd.verify(2));
        assertEquals("Even", evenOrOdd.verify(4));
        assertEquals("Odd", evenOrOdd.verify(5));
        assertEquals("Odd", evenOrOdd.verify(7));
    }
}