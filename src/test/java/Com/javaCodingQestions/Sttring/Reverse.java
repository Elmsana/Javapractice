package Com.javaCodingQestions.Sttring;

public class Reverse {
   // Solution 1

    public static String StrReverse1(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--)

            reverse += str.toCharArray()[i];



        return  reverse;

    }



   // Solution 2

    public  static String  Reverse2(String str) {

        return new StringBuffer(str).reverse().toString();

    }
}
