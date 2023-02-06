package String_Intro;

public class StringClassConstructor {

    public static void main(String args[]){
        String s= new String(); // No-Argument construcor = ya yak empty object create karta he.
        System.out.println(s.length());

        String s1= new String("Deeksha"); // String Literal construcor =
        System.out.println(s1.length());

        StringBuffer sb = new StringBuffer("Deeksha"); // String Buffer construcor = ya mutable object create karta he
        String s2= new String(sb); // ya humara immutable object he.
        System.out.printf(s2);

        StringBuilder bs = new StringBuilder("Sunil"); // String Builder construcor = ya mutable object create karta he
        String s3= new String(bs); // ya humara immutable object he.
        System.out.printf(s3);

        byte[] b= {101,102,103};   //String byte constructor
        String bt = new String(b);
        System.out.printf(bt);

        char[] c1= {'a','b','c'};   //String char constructor
        String cr = new String(c1);
        System.out.printf(cr);
    }

}
