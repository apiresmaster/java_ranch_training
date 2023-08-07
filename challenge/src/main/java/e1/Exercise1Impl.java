package e1;

public class Exercise1Impl implements Exercise1 {

    public String verify(Integer number) {
        if (number == null) {
            throw new NullPointerException("Null");
        }

        if ((number % 2) == 0) {
            return "Even";
        }

        if (number < 0) {
            return "Negative";
        }
        return "Odd";
    }
}