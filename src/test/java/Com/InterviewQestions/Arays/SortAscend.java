package Com.InterviewQestions.Arays;

import java.util.ArrayList;

public class SortAscend {
//    Ex:
//
//    int[] arr = {10, 9, 8, 7};
//
//    arr = Sort(arr);         ==>{ 7, 8, 9, 10};
//


    // Solution 1:

    public static int[] Sort(int[] a) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int each : a)

            list.add(each);


        for (int i = 0; i < a.length; i++) {

            a[i] = findMin(list);

            list.remove(Integer.valueOf(a[i]));

        }

        return a;

    }

    public static int findMin(ArrayList<Integer> a) {

        int min = Integer.MAX_VALUE;

        for (int each : a)

            min = Math.min(min, each);

        return min;

    }


    //  Solution 2:

    public static void SortingArrayAsc(int[] arr) {

        ArrayList<Integer> list = new ArrayList();

        for (int each : arr) {

            list.add(each);

        }

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }

        }

        for (int i = 0; i < list.size(); i++) {

            arr[i] = list.get(i);

        }

    }
}