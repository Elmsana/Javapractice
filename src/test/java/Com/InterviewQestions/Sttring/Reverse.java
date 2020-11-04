package Com.InterviewQestions.Sttring;

public class Reverse {
    public static void main(String[] args) {
        String str1 = "amanuel";
        System.out.println(strReve(str1));
    }

    public static String strReve(String str) {
        String re = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            re += str.charAt(i);
        }
        return re;

    }
}
