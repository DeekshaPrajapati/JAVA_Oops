package ExceptionHandling;
/*
e.printStackTrace = ya exception ki all information print karwa deta he, with name description and kis line ke andar exception he.
e.toString()= ya stack trace print nhi karwata he.
e.getMessage()= ya exception name and stack trace print nhi karega. only description print karwata he
 */
public class PrintException {

    public static void main(String args[]){

        int a=10, b= 0,c;
        try{
            c= a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
           // e.printStackTrace();
          // System.out.println(e.toString());
            System.out.println(e.getMessage());
        }

    }
}
