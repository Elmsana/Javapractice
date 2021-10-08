package Com.InterviewQestions.Maap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortMayValue {
    public static void main(String[] args) {


        System.out.println();
    }


    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        list.sort(Map.Entry.comparingByValue());
        map = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }
        return map;
    }
}

    /*    List<Entry<String, Integer>> list = new ArrayList(map.entrySet());

        list.sort(Entry.comparingByValue());

        map = new LinkedHashMap();

        for(Entry<String, Integer> each : list) {

            map.put(each.getKey(), each.getValue());

        }

        return map;
*/
    

