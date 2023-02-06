package Polymorphism_MethodOverRiding;
/*
  Access Modifiers= Overriding me access modifier allow hota he
  lakin jo child class he uska access modifier always badha hona chiya child class se.
 */
public class OverRidingCase_2 {
   //  void show() {    // allow
    public void show() {
        System.out.println("this is a access modifier");
    }

}
class overrid{
    //  void show() {    // but here not allow
    public void show(int a){
        System.out.println("this is a child access modifier");
    }
    public static void main(String arg[])
    {
        overrid obj = new overrid();
        obj.show(10);

        OverRidingCase_2 cas = new OverRidingCase_2();
        cas.show();

    }
}
