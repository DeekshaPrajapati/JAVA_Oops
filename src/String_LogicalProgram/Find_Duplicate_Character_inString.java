package String_LogicalProgram;

// program to find the duplicate characters in a string

public class Find_Duplicate_Character_inString {

    public static void main (String args[]){

        String str = "beautiful beach";
        char[] carry = str.toCharArray();

        System.out.println("Original string " +str);
        System.out.println("Duplicate character in a string " );
        for(int i=0; i<str.length(); i++){

            for(int j= i+1; j<str.length(); j++){

                if(carry[i] == carry[j]){
                    System.out.println(carry[j] + " ");
                    break;
                }

            }
        }
    }
}
