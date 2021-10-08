package Com.oop;

public class ConstructorEx {


        int age;
        String name;

        //Default constructor
        ConstructorEx(){
            this.name="Chaitanya";
            this.age=30;
        }

        //Parameterized constructor
        ConstructorEx(String n, int a){
            this.name=n;
            this.age=a;
        }


    public static void main(String args[]){
        ConstructorEx obj1 = new ConstructorEx();
        ConstructorEx obj2 = new ConstructorEx("Steve", 56);
        System.out.println(obj1.name+" "+obj1.age);
        System.out.println(obj2.name+" "+obj2.age);
    }
}
