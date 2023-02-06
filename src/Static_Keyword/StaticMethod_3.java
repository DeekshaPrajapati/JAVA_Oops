package Static_Keyword;
/*
static method ke andar hum only static method ko hi call karwa sakte he non- static method ko call nhi karwa sakte.
 */
public class StaticMethod_3 {

    static void show(){
        disp();
       // dik(); // error because these non-static method
        System.out.println("hii");
    }

    static void disp(){
        System.out.println("hello");
    }

    void dik(){
        System.out.println("hello");
    }
}
