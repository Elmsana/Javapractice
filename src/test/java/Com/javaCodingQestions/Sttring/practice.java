package Com.javaCodingQestions.Sttring;
public class practice {

//public String myVar="instance variable";

public void myMethod(){
        // local variable
        String myVar = "Inside Method";
        System.out.println(myVar);
        }
public static void main(String args[]){
        // Creating object
        practice obj = new practice();

        /* We are calling the method, that changes the
         * value of myVar. We are displaying myVar again after
         * the method call, to demonstrate that the local
         * variable scope is limited to the method itself.
         */
        System.out.println("Calling Method");
        obj.myMethod();
       // System.out.println(obj.myVar);
        }
        }





