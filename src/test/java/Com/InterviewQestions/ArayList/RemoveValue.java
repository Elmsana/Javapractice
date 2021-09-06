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

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,34,3,5,7,8,90,1,23,123,556,777));
        Iterator<Integer> li1 = list1.listIterator();
        //Iterator<Integer> li1 = list1.listIterator();
        while(li1.hasNext())
            if(li1.next()< 100)
                li1.remove();
        System.out.println(list1);

    }

    }

