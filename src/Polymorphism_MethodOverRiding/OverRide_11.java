package Polymorphism_MethodOverRiding;
/*
parent class ke method yadi private he to usko hum child class ke andar override nhi kar sakte he.

 */
public class OverRide_11 {

    private void show(){
        System.out.println("This is my show method of parent class");
    }
}
class test8 extends OverRide_Role10{
//            void show(){  // Here showing error
//
//        System.out.println("This is my show method of child class");
//    }
    public static void main(String args[]){
        test8 obj = new test8();

        obj.show();
    }
}
