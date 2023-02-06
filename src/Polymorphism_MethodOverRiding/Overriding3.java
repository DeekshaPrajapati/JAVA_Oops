package Polymorphism_MethodOverRiding;
/*
  Type of argument are same
 */
public class Overriding3 {

    void show(String a) {
        System.out.println("This is First method");
    }

}

class override4 extends Overriding3 {

    void show(String a) {

        System.out.println("This is Second method");
    }

    public static void main(String[] args) {
        override4 obj = new override4();
        obj.show("abc");

        Overriding3 obj1 = new Overriding3();
        obj1.show("abc");

    }
}
