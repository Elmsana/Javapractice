package Com.javaCodingQestions.ArayList;

import java.util.ArrayList;
import java.util.List;

public class SortDescend {

    public static int[] Sort(int[] a) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int each : a)
            list.add(each);
        for (int i = 0; i < a.length; i++) {

            a[i] = findMax(list);
            list.remove(Integer.valueOf(a[i]));
        }
        return a;

    }

    public static int findMax(ArrayList<Integer> a) {
        int max = Integer.MIN_VALUE;
        for (int each : a)
            max = Math.max(max, each);
        return max;

    }

    public static void SortingArrayListDesc(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) > list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }
        }
    }
}
