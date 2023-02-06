package Polymorphism_MethodOverRiding;
/*
Sequence of argument are same
 */
public class OverRiding5 {

    void show(String a ,int b) {
        System.out.println("This is my First method");
    }

}

class override6 extends Overriding3 {

    void show(String a, int b) {

        System.out.println("This is my Second method");
    }

    public static void main(String[] args) {
        override6 obj = new override6();
        obj.show("xyz",10);

        OverRiding5 obj5 = new OverRiding5();
        obj5.show("abc",20);

    }
}
