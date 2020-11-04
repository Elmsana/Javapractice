package Com.InterviewQestions.Arays;

import java.util.Arrays;

public class FindMaximum {
    public static void main(String[] args) {
        int[] findmax = {4, 5,6,7,65, 7, 7, 4, 3, 3, 5, 3,340, 5, 35, 74, 57, 45, 48};
        System.out.println(maxValue(findmax));
    }

    public static int maxValue(int[] n) {
       /* int min = Integer.MIN_VALUE;
           for (int each : n) {
            if (each > min) min = each;
        }  return min;*/
       Arrays.sort(n);
       return (n.length);
    }
}
