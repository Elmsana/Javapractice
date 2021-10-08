package Com.InterviewQestions.ArayList;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {

    public static void main(String[] args){
        String input = "Geeks is good";
        System.out.println(input);
        String reverse="";

        List<Character> arrList = new ArrayList<>();

        for (char c: input.toCharArray()) {
            arrList.add(c);
        }
        Collections.reverse(arrList);

        Object[] arr2 = arrList.toArray();
        for(int i = 0; i <arr2.length; i++)
        {
            reverse += arr2[i];
        }
        System.out.println(reverse);
         }

}

