package ExceptionHandling;
/*
Five keyword are to handile exception
try, catch, finally, throws, throw
 */
public class Handling_BytryCatch {

    public static void main(String args[]){

        int a=10, b= 0,c;
        try{
            c= a/b;                       // try ke insid risky code hota he and catch ke inside handling ka code hota he.
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println(e); // e is reference of arithmetic exceptino
        }

    }
}
