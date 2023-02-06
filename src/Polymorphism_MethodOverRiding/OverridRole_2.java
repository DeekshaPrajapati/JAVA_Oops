package Polymorphism_MethodOverRiding;
/*
 ydi parent class me yadi runtime exception throw kara diya to child class me bhi hum
 runtime exception throw karwa sakte he
 */
public class OverridRole_2 {

    void test() throws RuntimeException{
        System.out.println("same exception 1");
    }
}

class role_22{
    void test() throws RuntimeException{
        System.out.println("same exception 222");
    }

    public static void main(String arg[]){
        role_22 ob = new role_22();
        ob.test();

        OverridRole_2 ob1 = new OverridRole_2();
        ob1.test();
    }
}
