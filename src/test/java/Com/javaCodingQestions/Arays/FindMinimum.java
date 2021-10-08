package Com.javaCodingQestions.Arays;

import java.util.Arrays;

public class FindMinimum {

    public static void main(String[] args) {
        int[] numbers1 = {1, 4, 5, 6, 7, 65, 7, 7, 4, 3, 3, 5, 3, 340, 5, 35, 74, 57, 45, 48};
        System.out.println(minValue1(numbers1));
        System.out.println(minValue2(numbers1));
        // Solution 1:
    }
    public static int minValue1(int[] n) {

        int min = Integer.MAX_VALUE;

        for (int each : n)

            if (each < min)

                min = each;


        return min;

    }


    // Solution 2:

    public static int minValue2(int[] n) {

        Arrays.sort(n);

        return n[0];

    }
}