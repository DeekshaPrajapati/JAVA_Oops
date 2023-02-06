package Access_Modifiers;

/*
If you make any class constructor private, you cannot create the instance of that class from outside the class.
 */
public class RoleOf_PrivateAccessModifier {

    private RoleOf_PrivateAccessModifier(){ //private constructor

    }
    void msg(){

        System.out.println("Hello java");
    }
}
//public class Simple{
    //public static void main(String args[]){
      //  RoleOf_PrivateAccessModifier obj=new RoleOf_PrivateAccessModifier();//Compile Time Error
   // }
//}

