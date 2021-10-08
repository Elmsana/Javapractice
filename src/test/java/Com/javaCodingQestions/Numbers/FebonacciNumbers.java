package Com.javaCodingQestions.Numbers;

public class FebonacciNumbers {
    public static int fib(int num){
        int result=0;
        int j=0;
        int z=1;

        for(int i=1; i<num; i++){

            result=j+z;
            j=z;
            z=result;

        }

        return result;

    }
}
