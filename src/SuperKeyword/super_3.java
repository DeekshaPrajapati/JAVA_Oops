package SuperKeyword;
/*
Super keyword can be used to invoke immediate parent class method
 */
public class super_3 {

    void a1(){
        System.out.println("this is my a1 method");
    }
}
class a2 extends super_3{
    void show(){
        super.a1();
    }

    public static void main(String args[]){
        a2 obj = new a2();
        obj.show();
    }
}
