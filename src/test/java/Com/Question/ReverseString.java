package Com.Question;

public class ReverseString {
    public static void main(String[] args) {
        String str = "selamawit3";
      //  String reversed ="";

//       StringBuilder re = new StringBuilder(str);
//        System.out.println(re.reverse());
         String re = new StringBuilder(str).reverse().toString();
        System.out.println(re);
    }

}
