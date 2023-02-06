package Static_Keyword;
/*
static method belongs to class, not object
# static method ko hum direct  and class ke name se call karwa sakte he.

 */
public class static_Method {

    static void ty(){
        System.out.println("this is my static method");
    }

    public static void main(String args[]){
        static_Method.ty(); // by class name call
        ty(); //direct call
    }
}
