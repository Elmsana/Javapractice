package tests;

public class frequency {
    public static void main(String[] args) {
        System.out.println();


    }

//        String s1 = "Java";
//        String s2 = "Java";
//        StringBuilder sb1 = new StringBuilder();
//        sb1.append("Ja").append("va");
//        System.out.println("1 "+s1 == s2);
//
//        //System.out.println("n "+s1.equals(s2));
//       System.out.println("3 "+sb1.toString() == s1);
//       // System.out.println("n "+sb1.toString().equals(s1));

    public static String Reverse(String str) {
           String str1  = "AMAN";
        String reverse = "";

        for (int i = str1.length() - 1; i > 0; i--) {
            reverse += str1.charAt(i);
        }
        return reverse;
    }

//    public static String frequincy1(String str1) {
//        String count = "";
//        for (int i = 0; i >= str1.length() ; i++) {
//            count += str1.length();
//        }
//        return count;
//    }

}