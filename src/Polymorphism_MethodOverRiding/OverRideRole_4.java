package Polymorphism_MethodOverRiding;
/*
yadi parent class ke method me runtime exception throw karwa de and child class
me koi bhi exception thow nhi karwya tab bhi program run ho jyga
 */
public class OverRideRole_4 {

    void test() throws RuntimeException{
        System.out.println("same exception 1");
    }
}

class role_24{
    void test() {
        System.out.println("same exception 222");
    }

    public static void main(String arg[]){
        role_24 ob = new role_24();
        ob.test();

        OverRideRole_4 ob1 = new OverRideRole_4();
        ob1.test();
    }
}
