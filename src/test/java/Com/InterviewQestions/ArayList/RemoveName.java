package Com.InterviewQestions.ArayList;

import java.lang.reflect.Array;
import java.util.*;

public class RemoveName {
    public static void main(String[] args) {
        ArrayList<Integer> name = new ArrayList<>(Arrays.asList(1,4,5));
        name.add(4,3);
     //   name.get(4);
       name.remove(5);

//        name.removeAll(Arrays.asList(5,6));
        System.out.println("    ArrayList = "+name);


    }

}