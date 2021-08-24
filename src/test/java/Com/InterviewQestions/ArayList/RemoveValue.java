package Com.InterviewQestions.ArayList;

import java.util.*;

public class RemoveValue {

    public static void main (String [] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,34,3,5,7,8,90,1,23,123,556,777));
        Iterator<Integer> li = list.listIterator();
        while(li.hasNext())
            if(li.next()> 100)
                li.remove();
        System.out.println(list);

    }

}
