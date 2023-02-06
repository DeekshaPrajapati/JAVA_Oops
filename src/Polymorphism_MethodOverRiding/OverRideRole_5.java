package Polymorphism_MethodOverRiding;
/*
Ydi child class ki method me koi parent exception thorow karwate he .
and parent class ki method me uska child exceptinon throw karwate he to compile time error ayga
 */
public class OverRideRole_5 {

    void test() throws RuntimeException{
        System.out.println("same exception 1");
    }
}

class role_25 {
    void test() throws Exception{
        System.out.println("same exception 222");
    }

    public static void main(String arg[]){
        role_24 ob = new role_24();
        ob.test();

        OverRideRole_5  ob1 = new  OverRideRole_5 ();
        ob1.test();
    }
}
