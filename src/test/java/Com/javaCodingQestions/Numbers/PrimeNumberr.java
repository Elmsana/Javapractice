package Com.javaCodingQestions.Numbers;

public class PrimeNumberr {
    public static void main(String[] args) {
        int num =1;
        System.out.println(primeNumber(num));
    }
    public static boolean primeNumber(int num) {

        boolean result = false;

        if (num <= 1) {

            return result;

        }

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {

                return true;

            }

        }


        return result;

    }

    }

