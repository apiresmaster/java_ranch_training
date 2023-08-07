import e2.Exercise2;
import e2.Exercise2Impl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise2Test extends Exercise2Impl {
    private Exercise2 e2 = new Exercise2Impl();

    @Test
    void testIfRepeat_A_4Times() {
        assertEquals("aaaa", e2.repeatStr(4, "a"));
    }

    @Test
    void testIfRepeat_Hello_3Times() {
        assertEquals("HelloHelloHello", e2.repeatStr(3, "Hello"));
    }

    @Test
    void testIfRepeat_Empty_5Times() {
        assertEquals("", e2.repeatStr(5, ""));
    }

    @Test
    void testIfRepeat_kata_0Times() {
        assertEquals("kata", e2.repeatStr(0, "kata"));
    }

}
