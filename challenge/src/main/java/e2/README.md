# Description

Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n
times.

```
Examples (input -> output)
6, "I"     -> "IIIIII"
5, "Hello" -> "HelloHelloHelloHelloHello"
```

## Solution

````java
public interface Exercise2 {
  String repeatStr(int count, String str) {
    //code here
  }
}
````

## Sample tests

```java
class TestExample {
  
    Exercise2 e2 = new Exercise2Imp();
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
```
