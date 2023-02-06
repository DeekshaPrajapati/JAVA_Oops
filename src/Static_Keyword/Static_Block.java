package Static_Keyword;
/*
static block execute automatically when the class is loaded in the memory
# Before java 1.6 version static block ko without main method ke execute karwa sakte he.
# After java 1.6 version static block ko execute karne ke liya main method bana hoga then program run hoga to sabse phle static block chalega
# yak class ke andar multiple static block bana sakte he. Execution top to bottom hoga.
 ***************************USe*********************
 #1. Native method ko load karwana ka code hum static block ke andar likhte he.
 #1. static member ko initialize karna ho to bo hum static block ke andar hi karte he.
 */
public class Static_Block {
     static int a;
    static{
        a=10;
        System.out.println("Static Block");
    }
    public static void main(String args[]){
        System.out.println("MAin Method");
    }

    static{

        System.out.println("After main method Static Block");
    }
}
