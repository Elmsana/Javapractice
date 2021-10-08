package Com.javaCodingQestions.Numbers;

public class FactorialNum {
    // 2! =2x1 =2
    // 3! =3x2x1=6
    //4! 4x3x2x1=24
    //
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
