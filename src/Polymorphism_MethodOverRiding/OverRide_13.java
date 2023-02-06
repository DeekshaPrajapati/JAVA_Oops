package Polymorphism_MethodOverRiding;

/*
        parent class ke method yadi strictfp keyword ka use kiya he to usko hum child class ke andar override  kar sakte he.
        And strictfp ketword ko hum child class ke method ke aga bhi laga ka program run ho jyaga
 */
public class OverRide_13 {

    strictfp void show(){
        System.out.println("This is my show method of parent class");
    }
}
class test0 extends OverRide_13{
    void show(){
        System.out.println("This is my show method of child class");
    }
    public static void main(String args[]){
        test0 obj = new test0();
        obj.show();

        OverRide_13 ob = new  OverRide_13();
        ob.show();
    }
}
