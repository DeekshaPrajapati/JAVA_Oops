package WrapperClass;

public class Autoboxing {

    public static void main (String args[])
    {
        int a= 10;

        Integer b= new Integer (a); // Here first integer are Wrapper class and Integer are Wrapper object.
        System.out.println(a);
        System.out.println(b);

    }
}

//public class AutoBoxingDemo {
//    public static void main(String[] args) {
//        //Converting int to Integer
//        int a=20;
//        //Converting int to Integer Explicitly
//        Integer i=Integer.valueOf(a);
//        // autoboxing, now compiler will write Integer.valueOf(a) internally
//        Integer j=a;
//        System.out.println(a+" "+i+" "+j);
//        //OP:20 20 20
//    }
//}

