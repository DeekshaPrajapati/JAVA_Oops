package ExceptionHandling;
/*
try ke bad direct finally block use kar sakte he. jab exception aya or na bhi aya.
 */
public class Handl_finalblock {

    public static void main(String args[]){

//        int a=10, b= 2,c;
//        try{
//            c= a/b;
//            System.out.println(c);
//        }

        int a=10, b= 0,c;
        try{
            c= a/b;
            System.out.println(c);
        }

        finally {
            System.out.println("This is finally block");
        }

    }
}
