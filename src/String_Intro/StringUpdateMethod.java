package String_Intro;
/*
replace()
replaceAll()
replaceFirst()
 */
public class StringUpdateMethod {

    public static void main(String args[]) {
        String f = "This is java";
        System.out.printf(f.replace("is","was")); //replace()= ya jaha is ya uslo was se replace kar dega

        String f1 = "This is java";
        System.out.printf(f1.replaceFirst("is","was")); // ya method jab first time per is milega tab hi replace karga second time nhi karega replace.

        String f2 = "This is java";
        System.out.printf(f2.replaceAll("is","was")); // ya same replace method but yaha rejex call hota he.

        String f3 = "This is java";
        System.out.printf(f3.replaceAll("is(.)","was")); //(.) ya space ko remove kar dega

        String f4 = "This is java";
        System.out.printf(f3.replaceAll("is(.*)","was")); //(.*) ya replace karne ke bas all string delete kar dega.
    }
}