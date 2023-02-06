package Polymorphism_MethodOverRiding;
/*
RelationShip Between Overriding and Abstract Method:-
Yadi koi normal class kisi abstract class ko inherit karti he to inherit class ke andar abstract method
hona chiya , and bo abstrict method child class he andar override hona chiya tabhi program run hoga
nhi to error show hogyi.
And hum Abstract class ka object create nhi kar sakte he.
 */
public abstract class OverRidingRole_6 {

//    abstract void disp(){
//
//    }

    void show(){
        System.out.println("This is show class");
    }

}

//class test extends OverRidingRole_6{
//
//    abstract void disp(){
//
//    }

//    void show(){
//        System.out.println("This is show class");
//    }

//    public static void main(String args[]){
//        test te = new test();
//        te.show();
//        te.disp();
//    }
//}
