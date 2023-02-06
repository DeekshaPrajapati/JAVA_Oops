package String_Intro;
/*
indexof()
lastindexof()
charAt()
contains()
startsWith()
endWith()
 */
public class StringSearchingMethod {
    public static void main(String args[]){
        String a= "diksha";
        System.out.printf(String.valueOf(a.indexOf('k')));
        System.out.printf(String.valueOf(a.indexOf("ks")));
        System.out.printf(String.valueOf(a.lastIndexOf("s"))); // ya method last se indexing karega.
        System.out.printf(String.valueOf(a.charAt(3))); // ya integer me value pass karte he and string return karta he.
        System.out.printf(String.valueOf(a.contains("ha"))); //ya check karta he ki ya string present he ki nhi. return true false karta he.
        System.out.printf(String.valueOf(a.startsWith("a")));
        System.out.printf(String.valueOf(a.endsWith("a")));
    }
}
