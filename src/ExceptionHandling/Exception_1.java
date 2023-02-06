package ExceptionHandling;
/*
Exception always run time per hi occure hoti he.
 */
public class Exception_1 {

    public static void main(String args[]){
        try {
            int value = 100/0;
        }
        catch(ArithmeticException e){
           System.out.println(e);
        }
     System.out.println("Code is rest.........");
    }
}
