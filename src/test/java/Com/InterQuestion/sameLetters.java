package Com.InterQuestion;

import java.util.Arrays;
import java.util.TreeSet;

public class sameLetters {
    public static void main(String[] args) {
        String s = "madam";
        String b="";
        String t = "";
        for(int i = s.length()-1;i>=0;i--)
        {
            t+=s.charAt(i);
        }
        if(t==s){
            System.out.println(t);
            System.out.println("it's pallendrum");
        } else{
            System.out.println("it's not ");
            System.out.println(t);
        }

    }
    public static boolean same(String a, String b) {

        char[] ch1 = a.toCharArray();

        char[]  ch2 = b.toCharArray();

        Arrays.sort(ch1);

        Arrays.sort(ch2);

        String a1="", a2="";

        for(char each: ch1)

            a1 +=each;



        for(char each: ch2)

            a2 +=each;



        return  a1.equals(a2) ;

    }
    //or

    public static boolean Same(String str1, String str2) {

        str1 = new TreeSet<String>(Arrays.asList( str1.split("") ) ).toString( );

        str2 = new TreeSet<String>(Arrays.asList( str2.split("") ) ).toString( );

        return  str1.equals(str2);

    }


}
