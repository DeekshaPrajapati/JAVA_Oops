package Polymorphism_MethodOverRiding;
/*
parent class ke method yadi static he to usko hum child class ke andar override nhi kar sakte he.
 */
public class OverRide_Role10 {

    static void show(){
        System.out.println("This is my show method of parent class");
    }
}
class test7 extends OverRide_Role10{
//        void show(){  // Here showing error
//
//        System.out.println("This is my show method of child class");
//    }
    public static void main(String args[]){
        test7 obj = new test7();

        obj.show();
    }
}
