package Polymorphism_MethodOverRiding;
/*
super.show(); statement ke throw hum parent class ki method ko run kara sakte he and is statement ko
huma child class ki method ki body ke andar likhna padega.

child class ke object ke throw hum parent class ke method ko bhi call karsake he with super keyword.
 */
public class OverRide_8 {

    void show(){
        System.out.println("This is my show method of parent class");
    }
}
class test2 extends OverRide_8{
    void show(){
        super.show();
        System.out.println("This is my show method of child class");
    }
    public static void main(String args[]){
        test2 obj = new test2();
        obj.show();
    }
}
