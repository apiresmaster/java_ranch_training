# Description

Create a method that takes an integer as an argument and returns `Even` for even numbers or `Odd` for odd numbers.

## Solution

````java
interface Exercise1 {
  String verify(Integer number) {
    //code here
  }
}
````
Disclaimer: You need to create an implementation for the EvenOrOdd interface and use it on test

## Sample tests

```java
import e2.Exercise2;

class TestExample {
  @Test
  void testFixed() {
    Exercise2 evenOrOdd = new Exercise2Impl();
    
    assertEquals("Even", evenOrOdd.verify(2));
    assertEquals("Even", evenOrOdd.verify(0));
    assertEquals("Odd", evenOrOdd.verify(7));
    assertEquals("Odd", evenOrOdd.verify(1));
  }
}
```
