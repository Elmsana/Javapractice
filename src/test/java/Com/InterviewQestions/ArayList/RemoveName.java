package Com.InterviewQestions.ArayList;

import java.util.*;

public class RemoveName {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
names.removeAll((Arrays.asList("Ahmed")));
       // names.removeAll((Arrays.asList("Ahmed")));
        System.out.println(names);
    }

   /* List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

    Iterator<String> it = names.iterator();

    while(it.hasNext())

    {

        if (it.next().equals("Ahmed"))

            it.remove();


        System.out.println(names);

    }
    */


}