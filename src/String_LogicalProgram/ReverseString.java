package String_LogicalProgram;

//Program to find Reverse of the string
public class ReverseString {

    public static void main(String args[])
    {
        String str= "Deeksha";
        String revStr= "";

        for(int i=str.length()-1; i>=0; i--){
            revStr = revStr+str.charAt(i);
        }

        System.out.println("Original String :: " +str);
        System.out.println("After reverse a String :: " +revStr);
    }
}
