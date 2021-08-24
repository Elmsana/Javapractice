package Com.InterviewQestions.Numbers;

public class ReverseNegativeNum {


 //   public static int reverseNum(int  num) {
   public static void main(String[] args) {
      int num = -9;

        String str = new StringBuilder(""+num).reverse().toString();

        if(num < 0) {

            str = "-"+str.substring(0, str.length()-1);

        }

      //  return Integer.valueOf(str);
       System.out.println(Integer.valueOf(str));

    }
}
