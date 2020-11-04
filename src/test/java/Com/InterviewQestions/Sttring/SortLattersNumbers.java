package Com.InterviewQestions.Sttring;

import java.util.Arrays;

public class SortLattersNumbers {
    /*
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"
*/
    public static void main(String[] args) {
        String str1 = "DCAT501GCBCCA098911WEA";
        System.out.println(SortLetNumsOfStr(str1));
    }
    public static String SortLetNumsOfStr(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 += "" + str.charAt(i);
            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    str2 += ",";
                }
            }
            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isAlphabetic(str.charAt(i + 1))) {
                    str2 += ",";
                }
            }
        }
            String[] arr = str2.split(",");
            str = "";
            for (String each : arr) {
                char[] chars = each.toCharArray();
                Arrays.sort(chars);
                for (char eachChar : chars) {
                    str += "" + eachChar;
                }
            }
            return str;
        }
}

