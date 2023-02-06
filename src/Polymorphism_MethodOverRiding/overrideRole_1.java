package Polymorphism_MethodOverRiding;
/*  Overriding and Exception Handling

Role-1   yadi parent class ka method koi exception thorow nhi karta he to
   child class ka method unchecked exception (Arithmetic exception) ko hi throw kar sakta he checked exception ko throw
   nhi karega.
 */
public class overrideRole_1 {

    void test(){
        System.out.println("Parent class test method");
    }
}

class role_2 extends overrideRole_1{

    //void test() throws Exception{ // this is not valid because this is a checked exception
    void test() throws ArithmeticException
    {
      System.out.println("Child class method");
    }

    public static void main(String arg[]){
        role_2 ob = new role_2();
        ob.test();

        overrideRole_1 ob1 = new overrideRole_1();
        ob1.test();
    }
}
