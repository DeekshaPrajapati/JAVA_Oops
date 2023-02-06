package Polymorphism_MethodOverRiding;
/*
 ydi parent class ke method me koi exception throw karwa raha he
 to  child class ke method me(parent class ke method ka ) child exception throw karwa sakte he
 */
public class overrideRole_3 {

    void test() throws RuntimeException{
        System.out.println("same exception 1");
    }
}

class role_23{
    void test() throws ArithmeticException{
        System.out.println("same exception 222");
    }

    public static void main(String arg[]){
        role_23 ob = new role_23();
        ob.test();

        overrideRole_3 ob1 = new overrideRole_3();
        ob1.test();
    }
}
