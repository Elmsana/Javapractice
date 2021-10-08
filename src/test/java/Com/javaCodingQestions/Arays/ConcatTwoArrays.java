package Com.javaCodingQestions.Arays;

public class ConcatTwoArrays {

    public static void main(String[] args) {
         int[] arr1 ={1,2,3,4,5};
         int[] arr2= {6,7,8};
        System.out.println(concatTwoArrays(arr1,arr2));
    }
    //Write a return method that can concate two arrays



   // Solution:

    public static int[] concatTwoArrays(int[] arr1 , int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;

        for(int each: arr1) {

            result[i] = each;

            i++;

        }

        for(int each: arr2) {

            result[i] =each;

            i++;

        }

        return result;

    }
}