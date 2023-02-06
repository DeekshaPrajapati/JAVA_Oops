package Polymorphism_MethodOverRiding;
/*
RelationShip Between Overriding and Interface And Abstract class:-
Yadi hum interface use karte ke override and abstract class me to interface ke andar jo method hota he
usko child class ke andar overide karana jaruri hota he and ya method public hoti he and
child class me hum inteface ko implement karte he
Interface ka kavhi object nhi banta he
 */
interface A1{

     default void disp(){

    }
}
abstract class OverRideRole_7 {


    void show(){
        System.out.println("This is abstract class");
    }

}

class test implements A1{
    public void disp(){
        System.out.println("This is child class");
    }

    void show(){
        System.out.println("This is show method");
    }
    public static void main(String args[]){
        test obj = new test();
        obj.disp();
        obj.show();
    }
}
