import e2.Exercise2;
import e2.Exercise2Impl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise2Test extends Exercise2Impl {
    Exercise2 e2 = new Exercise2Impl();
    @Test
    void test4a() {
        assertEquals("aaaa", e2.repeatStr(4, "a"));
    }

    @Test
    void test3Hello() {
        assertEquals("HelloHelloHello", e2.repeatStr(3, "Hello"));
    }

    @Test
    void test5empty() {
        assertEquals("", e2.repeatStr(5, ""));
    }

    @Test
    void test0kata() {
        assertEquals("", e2.repeatStr(0, "kata"));
    }



}
