import e1.Exercise1;
import e1.Exercise1Impl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {
    Exercise1 evenOrOdd = new Exercise1Impl();

    @Test
    void testIfValueIs_EvenOrOdd() {

        assertEquals("Even", evenOrOdd.verify(2));
        assertEquals("Even", evenOrOdd.verify(4));
        assertEquals("Even", evenOrOdd.verify(-2));
        assertEquals("Even", evenOrOdd.verify(0));
        assertEquals("Odd", evenOrOdd.verify(5));
        assertEquals("Odd", evenOrOdd.verify(7));
        assertEquals("Odd", evenOrOdd.verify(-1));
        assertEquals("Odd", evenOrOdd.verify(-3));
    }

    @Test
    void testIfValueIs_Null(){
        assertThrows(NullPointerException.class, () ->
            evenOrOdd.verify(null));

    }
}