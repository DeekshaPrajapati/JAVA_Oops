package Polymorphism_MethodOverRiding;
/*
parent class ke method yadi final he to usko hum child class ke andar override nhi kar sakte he.
 */
public class Override_Role9 {

   final void show(){
        System.out.println("This is my show method of parent class");
    }
}
class test6 extends Override_Role9{
//    void show(){  // Here showing error
//
//        System.out.println("This is my show method of child class");
//    }
    public static void main(String args[]){
        test6 obj = new test6();

        obj.show();
    }
}
