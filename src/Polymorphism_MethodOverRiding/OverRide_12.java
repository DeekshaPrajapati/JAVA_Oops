package Polymorphism_MethodOverRiding;
/*
parent class ke method yadi synchronized keyword ka use kiya he to usko hum child class ke andar override  kar sakte he.
And Synchronized ketword ko hum child class ke method ke aga bhi laga ka program run ho jyaga
 */
public class OverRide_12 {

    synchronized void show(){
        System.out.println("This is my show method of parent class");
    }
}
class test3 extends OverRide_12{
        void show(){
            System.out.println("This is my show method of child class");
    }
    public static void main(String args[]){
        test3 obj = new test3();
        obj.show();

        OverRide_12 ob = new  OverRide_12();
        ob.show();
    }
}
