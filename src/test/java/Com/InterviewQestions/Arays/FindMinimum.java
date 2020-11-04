package Com.InterviewQestions.Arays;

public class FindMinimum {
    public static int maxValue( int[]  n ) {

        int min = Integer.MAX_VALUE;

        for(int each: n)

            if(each < min)

                min = each;



        return min;

    }
}
