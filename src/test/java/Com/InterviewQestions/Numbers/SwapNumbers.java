package Com.InterviewQestions.Numbers;

public class SwapNumbers {
    //Swap two variable' values without using a third variable


    //  Solution 1:
    public static void main(String[] args) {


        int a = 10;
        int b = 20;

        a = a * b;

        b = a / b;

        a = a / b;


        // Solution 2:

        int a1 = 10;
        int b1 = 20;

        a1 = a1 ^ b1;

        b1 = a1 ^ b1;

        a1 = a1 ^ b1;

        int a2 = 10;
        int b2 = 20;
        int c2= a2;
        a2=b2;
        b2=c2;





        System.out.println("a= "+a +" b ="+b);
        System.out.println("a1 = "+a1+ " b1 ="+ b1);
        System.out.println("a2 = "+a2+ " b2 ="+b2);

    }
}
