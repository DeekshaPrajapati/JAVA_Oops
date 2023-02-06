package String_Intro;

public class StringMethod {
    /*
    String class provides a lot of built-in methods that are used to manipulate string in Java.
     By the help of these methods, we can perform operations on String objects such as
     trimming, concatenating, converting, comparing, replacing strings etc.
     */

    public static void main(String args[]){
        String name= "diksha";
        System.out.printf(String.valueOf(name.isEmpty())); // true false return karega.
        System.out.printf(name.trim());     // trim() ya output return karwata he ya method only aga and picha ke space ko remove karta he .
        System.out.printf(String.valueOf(name.length()));
    }
}
