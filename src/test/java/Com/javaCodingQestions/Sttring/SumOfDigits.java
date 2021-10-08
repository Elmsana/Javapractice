package Com.javaCodingQestions.Sttring;

public class SumOfDigits {
    //SumOfDigits in string
    public static void main(String[] args) {
        String x = "562";

        System.out.println(sumOfDigits(x));
    }
    public  static int  sumOfDigits(String sum) {
        int total = 0;
        char[] ch =  sum.toCharArray();
        for(char each: ch) { if(Character.isDigit(each))
        {
            total += Integer.valueOf(""+each);

            }
        }
        return total;
    }
}
