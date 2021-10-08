package Com.javaCodingQestions.Arays;

import java.util.Arrays;

public class FindMaximum {
    public static void main(String[] args) {
     //   int[] numbers = {1,4, 5,6,7,65, 7, 7, 4, 3, 3, 5, 3,340, 5, 35, 74, 57, 45, 48};
      //  System.out.println(maxValue1(numbers));
   //     System.out.println(maxValue2(numbers));
        int[]a ={1,3,4,6,7,8,9};
        for(int i =0; i<=a.length-1;i++)
        {
            System.out.print(a[i]);
        }

    }
  //  Solution 1:

    public static int maxValue1( int[]  n ) {

        int max = Integer.MIN_VALUE;

        for(int each: n)

            if(each > max)

                max = each;



        return max;

    }



   // Solution 2:

    public static int maxValue2( int[]  n ) {

        Arrays.sort( n );

        return  n [ n.length-1 ];

    }


}
