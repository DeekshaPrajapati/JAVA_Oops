package Access_Modifiers;

/*
There are two types of modifiers in Java: access modifiers and non-access modifiers.

The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class.
We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.
 */
class Private_1 {

    // Private= The private access modifier is accessible only within the class.

    private int data=40;
    private void msg(){
        System.out.println("Hello java");}
}

class Simple{
    public static void main(String args[]){
        Private_1 obj=new Private_1();
       // System.out.println(obj.data);//Compile Time Error
        //obj.msg();//Compile Time Error
    }
// Simple example of private access modifier
//
//In this example, we have created two classes private and Simple.
// private class contains private data member and private method. We are accessing these private members from outside the class,
// so there is a compile-time error.
}
