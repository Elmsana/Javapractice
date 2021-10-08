package Com.InterviewQestions.Sttring;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String FrOfCharNu = "ammnnnuuuueeeeellllll";
        System.out.println(FrequencyOfChars(FrOfCharNu));
    }

    public static String FrequencyOfChars(String str) {
        String nodup = "";

        for (int i = 0; i < str.length(); i++)

            if (!nodup.contains("" + str.charAt(i)))
                nodup += "" + str.charAt(i);
            String strNum = "";
            for (int j = 0; j < nodup.length(); j++)
            {
                int count = 0;
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == nodup.charAt(j)) count++;
            }
            strNum += "" + str.charAt(j) + "" + count;
        }
        return strNum;
    }
}



