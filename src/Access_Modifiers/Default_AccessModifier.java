package Access_Modifiers;

/*
If you don't use any modifier, it is treated as default by default.
The default modifier is accessible only within package. It cannot be accessed from outside the package.
 */
public class Default_AccessModifier {

    //save by A.java
//package pack;
//    class A{
//        void msg(){System.out.println("Hello");}
//    }


////save by B.java
//package mypack;
//import pack.*;
//    class B{
//        public static void main(String args[]){
//            A obj = new A();//Compile Time Error
//            obj.msg();//Compile Time Error
//        }
//    }
}
