package Com.InterviewQestions.ArayList;

import java.util.AbstractList;
import java.util.*;

public class SortInAccend {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 34, 3, 5, 7, 8, 90, 1, 23, 123, 556, 777));
        Iterator<Integer> li = list.listIterator();

    }

    public static void SortingArrayListAsc(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}