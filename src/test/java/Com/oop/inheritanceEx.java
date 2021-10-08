package Com.oop;

public class inheritanceEx {
    String designation = "Teacher";
    String college = "Beginnersbook";

    void does() {
        System.out.println("Teaching");
    }
}

    class MathTeacher extends inheritanceEx {
        String mainSubject = "Maths";

        public static void main(String args[]) {
            MathTeacher obj = new MathTeacher();
            System.out.println(obj.college);
            System.out.println(obj.designation);
            System.out.println(obj.mainSubject);
            obj.does();

                    int arr[]={2,11,45,9};
                    //i starts with 0 as array index starts with 0 too
                    int i=0;
                    while(i<3){
                        System.out.println(arr[i]);
                        i++;
                    }
                }
            }




