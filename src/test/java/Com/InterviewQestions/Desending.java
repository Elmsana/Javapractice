package Com.InterviewQestions;

import java.util.Arrays;

public class Desending {
    public static void main(String[] args) {


        int a[] = {3, 1, 5, 7, 2}; // first step {1,3,2}
        int n = a.length;
        int temp = 0;
        for (int i = 0; i < n; i++) //i=1
        {
            for (int j = i + 1; j < n; j++) //j=2. Once the inner loop condition becomes falls the outer loop incremented by 1
            {
                if (a[i] < a[j]) //To Swap if element compared is greater than other element
                // 3  >  1
                // to do Descending order we just change the greater sign from > to <
                {
                    temp = a[i]; //  3 we store the greater number here
                    a[i] = a[j]; // a[0] = 1
                    a[j] = temp; // a[1] = 3
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}