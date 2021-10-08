package Com.javaCodingQestions.Maap;

import java.util.*;

public class MinValue {
  //  Write a method that can return the minimum value from ta map (DO NOT use sort method)
    //Solution:

    public  static  int  minValue( Map<String,Integer>    map  ) {

        SortedSet<Integer> sm = new TreeSet<>(map.values());

        return sm.first( );

    }

    }


