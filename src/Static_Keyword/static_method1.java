package Static_Keyword;
/*
# static method ko within a class hi call karwa sakte he , class ke bhar yadi call karwana he to class ke name se hi call hoga
 */
public class static_method1 {

    static void show(){
       System.out.println("this is my show method");
    }
    public static void main(String args[]){
        show();
        river.disp(); // by class name call
    }
}
class river{
    static void disp(){
        System.out.println("this is my disp method");
    }
}
