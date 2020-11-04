package Com.InterviewQestions.Numbers;

import java.util.Scanner;

public class PrimeNumberr {
    public static void main(String[] args) {
        int num =1;
        System.out.println(checkPrime(num));
    }
    public static boolean checkPrime(int n) { if (n <= 1) {
        return false;
    }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) { return false;
            }
        }
        return true; }
    }



