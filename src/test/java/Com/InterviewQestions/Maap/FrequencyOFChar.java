package Com.InterviewQestions.Maap;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOFChar {
   /* public static void FrequencyTest(String  str ) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) { if (map.containsKey(each)) { map.put(each, map.get(each) + 1);

            } else {

                map.put(each, 1);

            }
        }

        System.out.println(map);
*/

   // public  static  String  FrequencyOfChars(String str) {
   public static void main(String[] args) {

   String str = "rrjhhddljdljahdkjheiuhkjkbkkjbaa";
        String expectedRe = "";
        int j=0;

        while( j < str.length()) {
            int count = 0;

            for(int i=0; i < str.length(); i++) {

                if(str.charAt(i) == str.charAt(j)) {

                    count++;

                }

            }

            expectedRe +=str.charAt(j)+"" + count;

            str = str.replace(""+str.charAt(j) ,  "" );

        }
       System.out.println(expectedRe);
       // return expectedRe;

    }
}
