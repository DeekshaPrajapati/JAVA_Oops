package Static_Keyword;
/*
static method only static data ko hi access karga non-static data ko access nhi karega
 */
public class staticmethod_2 {
    int i=8;
    static int a=6;
     static void show(){
         System.out.println(a);
        // System.out.println(i); // showing error because non static vari.
     }
}
