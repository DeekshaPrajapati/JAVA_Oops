package ExceptionHandling;
/*
Finally block always execute hota he. chahe exception ho ya na ho.
try ka andar exception occur nhi ho rhi he.
Finally block is a clean-up code block, jab koi connection ya functionality close karwane ho.
 */
public class Handle_ByFinally {

    public static void main(String args[]){

        int a=10, b= 2,c;
        try{
            c= a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is finally block");
        }

    }
}
