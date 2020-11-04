package Com.InterviewQestions.Sttring;

public class RemoveDup {
    // public static  String  removeDup( String  str) {
    public static void main(String[] args) {
        String str1 = "amanamanamanaman";
      //  String result = "";
        System.out.println(remDup(str1));
    }
    /*
public static String remDup(String str){ String du ="";
for (int i =0;i<str.length();i++){ if (!du.contains(""+str.charAt(i))) du+= str.charAt(i);
}
  return du;*/
    public static String remDup(String str1){
        String dup ="";
        for(int i = 0; i < str1.length();i++ ) {
            if (!dup.contains("" + str1.charAt(i))) dup += str1.charAt(i);
        }
        return dup;
    }
    }





