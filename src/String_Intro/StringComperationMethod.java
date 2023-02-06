package String_Intro;
/*
equals()
equalsignoreCase()
compareTo()
compareToIgnoreCase()
 */
public class StringComperationMethod {
    public static void main(String args[]){
        String a1="diksha";
        String a2="sunil";
        System.out.printf(String.valueOf(a1.equals(a2))); // equals() method true false return karega, ya empty bhi check karta he.

        String b1="Diksha";
        String b2="diksha";
        System.out.printf(String.valueOf(b1.equals(b2))); // yadi yaha per lower case and upper case differ ho and value same ho tab bhi he false hi return karega

        String c1="diksha";
        String c2="Diksha";
        System.out.printf(String.valueOf(c1.equalsIgnoreCase(c2))); // equalsIgnore() = ya upper lower case ko ignore kar deti he value true aygyi

        String d1="a"; // a ko decimal me convert karga val= 97
        String d2="A";  // A ko decimal me convert karega val= 65 Then 3rd line me 97-65 kar dega answer 32 ayga.
        System.out.printf(String.valueOf(d1.compareTo(d2))); // compareTo()= method interger value return karta he. ya upper and lower case ko ignore karta he

        String e1="Diksha";
        String e2="diksha";
        System.out.printf(String.valueOf(e1.compareToIgnoreCase(e2))); //  compareToIgnoreCase()= ya bhi int value return karega.

    }
}
