package String_Intro;
/*
toUpperCase()
tolowerCase()
 */
/*
Type Conversion Method=
1.) String.valueOf()
2.) s.toCharArray()
 */
public class StringConversionMethods {
    public static void main(String args[]){
        String e= "diksha";
        System.out.printf(e.toUpperCase()); // ya string ko upper case me convert kar dega.
        System.out.printf(e.toLowerCase()); // ya string ko lower case me convert kar dega.

        int a=10;
        String s1 = String.valueOf(a);
        System.out.printf(s1);
        char[] c= s1.toCharArray();
        System.out.printf(String.valueOf(c));
    }
}
