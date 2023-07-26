package e1;

public class Exercise1Impl implements Exercise1 {

    @Override
    public String verify(Integer number){

        if((number % 2) == 0){
            return "Even";
        }
        else {
            return "Odd";
        }
    }

}
