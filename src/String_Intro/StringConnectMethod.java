package String_Intro;
/*
1.)concat()
2.)String.join()
3.) subSequence()
4.) subString()
 */
public class StringConnectMethod {
// yaha bodmas ka mathematical rule follow hota he.
    public static void main(String args[]) {
        String k1 = "Diksha";
        String k2 = "sunil";
        System.out.println(k1 + k2);

        String k11 = "Diksha";
        String k22 = "10";
        System.out.println(k11 + k22);

        String k12 = "Diksha";
        String k23 = "sunil";
        String k3 = "20";
        System.out.println(k12 + k23+k3);

       // String p1 = "10";
       // String p2 = "20";
        String p3 = "java";
        System.out.println(10 +20+p3);
        System.out.println(p3 +20/10);


        String l1 = "Diksha";
        String l2 = "abc";
        System.out.println(l1.concat(l2)); // concat()

        String j1 = "Diksha";
        String j2 = "abc";
        System.out.println(String.join("sunil",j1,j2)); // String.join()

        String g1 = "This is java";
        System.out.println(g1.subSequence(2,6)); // subSequence()= ya char. sequence me o/p deta he
        // yaha per 0 se count krega and space bhi count hoga , mtlb o/p 2 se 6 se kam 5 tak ki print karega

        String n1 = "This is java";
        System.out.println(n1.substring(3)); // subString()= ya 3 ke bad all  string dedega
    }
}