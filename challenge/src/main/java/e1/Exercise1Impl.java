package e1;

public class Exercise1Impl implements Exercise1 {

    public String verify(Integer number) {

            if (number == null) {
                throw new NullPointerException("Number cannot be null");
            }

            if ((number % 2) == 0) {
                return "Even";
            }

            return "Odd";
        }
}
