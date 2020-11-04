package Com.InterviewQestions.Numbers;

public class FactorialNum {
    public static void main(String[] args) {
        int x = 1;
        System.out.println(factorialNumber(x));
    }
    public static int factorialNumber(int n){

        int result = 1;

        for(int i = 1; i <= n; i++){

            result = result * i;
        }
        return result;
    }
}
