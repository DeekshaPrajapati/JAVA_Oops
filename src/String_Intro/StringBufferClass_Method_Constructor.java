package String_Intro;
/*
String Buffer is a class and string buffer object are mutable. that means value ko change kar sakte he.
String buffer class all methods are synchronized. synchronized hone ke karana object thred save hota he jisse string buffer
ki performance slow ho jati he.

Syntax= public final class StringBuffer extends AbstractStringBuilder implements java.io.Serializable,CharSequence{

         }
 */
public class StringBufferClass_Method_Constructor {

/*
These are all constructor
 */
    public static void main(String args[]){
//        StringBuffer sb = new StringBuffer(); // StringBuffer Empty Constructor
//        System.out.printf(String.valueOf(sb.capacity())); // capacity ya batata he ki bo string buffer object ke andar kitne character store kar sakta he.
//
//        StringBuffer sb1 = new StringBuffer("diksha"); // StringBuffer string char Constructor
//        System.out.printf(String.valueOf(sb1.capacity())); // default capa= 16+length of string 5 =21
//
//        StringBuffer sb2 = new StringBuffer(1000); // StringBuffer int capicity Constructor
//        System.out.printf(String.valueOf(sb2.capacity())); // yaha hum apne object ke andar kitne no. of char asakte he uski value phle se likh sakte he.

        /*
        These are all method
         */
        StringBuffer sb = new StringBuffer("diksha");
      //  StringBuffer sb1 = new StringBuffer("diksha");
//        sb.append("hello");
//        System.out.printf(String.valueOf(sb.capacity()));
     //   System.out.printf(String.valueOf(sb.length()));
      //  System.out.printf(String.valueOf(sb.charAt(3)));
       // System.out.printf(String.valueOf(sb.delete(2 ,5)));
       // System.out.printf(String.valueOf(sb.deleteCharAt(4)));
       // System.out.printf(String.valueOf(sb.equals(sb1))); // ya stringbuffer class ko override nhi karta he. isliya ya false dega.
       // System.out.printf(String.valueOf(sb.indexOf("s")));
       // System.out.printf(String.valueOf(sb.insert(3,"iii")));
        System.out.printf(String.valueOf(sb.replace(3,6 ,"j")));

    }
}





