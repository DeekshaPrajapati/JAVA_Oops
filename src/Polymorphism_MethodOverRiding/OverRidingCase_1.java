package Polymorphism_MethodOverRiding;
/*
   Coveriant Return Type- that means yadi parent class ki method ka return type object he to 2nd class ki method ka return
   type uska child type ka return hona chiya tab overriding hoga,

   Do overriding method must have same return type (or subtype)

   Method ke return type same bhi ho sakte he
 */
public class OverRidingCase_1 {
    Object show(String a ,int b) {
        System.out.println("This is my First method");
        return "diks";
    }

}

class override7 extends OverRidingCase_1 {

    String show(String a, int b) {

        System.out.println("This is my Second method");
        return a;
    }

    public static void main(String[] args) {
        override7 obj = new override7();
        obj.show("xyz",10);

        OverRidingCase_1 obj5 = new OverRidingCase_1();
        obj5.show("abc",20);

    }
}
