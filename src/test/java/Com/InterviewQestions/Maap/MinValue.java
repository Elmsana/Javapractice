package Com.InterviewQestions.Maap;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class MinValue {
    public  static  int  minValue( Map<String,Integer> map  ) {

        SortedSet<Integer> sm = new TreeSet<>(map.values());

        return sm.first( );

    }
}
