package ExceptionHandling;
/*
Ab Exception try ka andar occur ho rhi he
 */
public class Handle_FinallyBlock {

    public static void main(String args[]){

        int a=10, b= 0,c;
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
