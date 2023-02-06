package Static_Keyword;
/*
Static variable always used in class level
static keyword are used for memory management
 */

//The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods,
// blocks and nested classes. The static keyword belongs to the class than an instance of the class.
//
//The static can be:
//
//Variable (also known as a class variable)
//Method (also known as a class method)
//Block
//Nested class
public class static_Variable {

    static int a=20;
    void mr(){
       // static int b=30;   // here not declear a static variable
    }

    public static void main(String args[]){
        System.out.println(static_Variable.a); // yadi var static he to object bana ki need nhi he direct class name se call kar sakte he
    }
}
