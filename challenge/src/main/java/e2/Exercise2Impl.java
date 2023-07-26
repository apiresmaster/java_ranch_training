package e2;

public class Exercise2Impl implements Exercise2{

    public int times = 0;

    public String repeatStr(int count, String str) {

        while(times < count){
            times++;

        }
        return  str.repeat(times);
    }

}



