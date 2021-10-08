package Com.javaCodingQestions.Numbers;

public class PrimeNumbers {

    public static boolean primeNumber(int num) {

        boolean result = false;

        if(num <= 1) {

            return result;

        }

        for(int i = 2; i < num; i++) {

            if(num % i == 0 ) {

                return true;

            }

        }



        return result;



    }


}
