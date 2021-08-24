package Com.InterviewQestions.ArayList;

import java.lang.reflect.Array;
import java.util.*;

public class RemoveName {
    public static void main(String[] args) {
            ArrayList<String> name = new ArrayList<>(Arrays.asList("aman","teame", "ravi"));
            name.removeAll((Arrays.asList("teame")));
            name.removeAll((Arrays.asList("ravi")));
            System.out.println(name);

            TreeSet<Integer> setn = new TreeSet<>(Arrays.asList(2,3,45,5,67,7,7));
            setn.removeAll(Arrays.asList(2,3,5));
        System.out.println(setn);










//
//
//

//        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
//names.removeAll((Arrays.asList("Ahmed")));
//       // names.removeAll((Arrays.asList("Ahmed")));
//
//        System.out.println(names);
    }




}