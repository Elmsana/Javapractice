package Com.InterviewQestions.Sttring;

public class FindUniq {


    public static String Unique(String str) {
//        String[] arr = str.split("");
//        String uniq = "";
//        for (int i = 0; i < arr.length; i++)
//        {
//            int count = 0;
//            for (int j = 0; j < arr.length; j++)
//            {
//                if (arr[j].contains(arr[i]))
//                    count++;
//            }
//                    if (count == 1)
//                    {
//                        uniq += arr[i];
//                    }
//                }
//                return uniq;

        String[] arr = str.split("");
        String uniq = "";
        for ( int i =0; i < arr.length; i++){
            int count =0;

            for(int j =0; j < str.length();j++) {


                if (arr[j].contains(arr[i]))
                    count++;
            }
        if(count ==1)
        {
            uniq+=arr[i];

        }

    }
return uniq;

}
}


