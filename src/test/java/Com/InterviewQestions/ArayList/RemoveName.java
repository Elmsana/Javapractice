package Com.InterviewQestions.ArayList;

import java.lang.reflect.Array;
import java.util.*;

public class RemoveName {
    public static void main(String[] args) {
        ArrayList<Integer> name = new ArrayList<>(Arrays.asList(1,5,2,6,3,8,7));
        name.add(4,4);
     //   name.get(4);
       name.remove(5);
//        name.removeAll(Arrays.asList(5,6));
        System.out.println("    ArrayList = "+name);

        LinkedList<String> name1 = new LinkedList<>(Arrays.asList("a","f","e", "a", "d","c","b","a"));
        name1.add(4,"z");
        name1.get(4);
        name1.remove("e");
        name1.removeAll(Arrays.asList("d","f"));
        System.out.println("   LinkedList = "+name1);

        TreeSet<String> setn = new TreeSet<>(Arrays.asList("a","f","e", "a", "d","c","b","a"));
        setn.add("z");
        setn.remove("e");
        setn.removeAll(Arrays.asList("d","f"));
        System.out.println("      TreeSet = "+setn);

        LinkedHashSet<String> lHS = new LinkedHashSet<>(Arrays.asList("f","e", "a", "d","c","b","a"));
        lHS.add("z");
        lHS.getClass();
        lHS.remove("e");
        lHS.removeAll(Arrays.asList("d","f"));
        System.out.println("LinkedHashSet = " +lHS);

        HashSet<String> HS = new HashSet<>(Arrays.asList("f","e", "a", "d","c","b","a"));
        HS.add("z");
        HS.remove("e");
        HS.removeAll(Arrays.asList("d","f"));
        System.out.println("      HashSet = " +HS);

        Vector<String> vC = new Vector<>(Arrays.asList("f","e", "a", "d","c","b","a"));
        vC.add("z");
        vC.remove("e");
        vC.removeAll(Arrays.asList("d","f"));
        System.out.println("       vector = " +vC);


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