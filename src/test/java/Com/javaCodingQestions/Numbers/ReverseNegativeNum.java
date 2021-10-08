package Com.javaCodingQestions.Numbers;



public class ReverseNegativeNum {

//   Write a return method that can reverse negative number and return it as int
 //   public static int reverseNum(int  num) {
   public static void main(String[] args) {
       int num = -9;
       System.out.println(reverseNum(num));
   }
   //Solution:

       public static int reverseNum(int  num) {

           String str = new StringBuilder(""+num).reverse().toString();

           if(num < 0) {

               str = "-"+str.substring(0, str.length()-1);

           }

           return Integer.valueOf(str);

       }
}
