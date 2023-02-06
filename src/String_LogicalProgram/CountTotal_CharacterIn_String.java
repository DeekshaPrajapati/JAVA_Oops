package String_LogicalProgram;

// Program to count the total number of characters in a string

public class CountTotal_CharacterIn_String {

    public static void main(String args[])
    {
        String s1= "My name is deeksha prajapati";
        int count =0;

        for(int i=0; i<s1.length();i++)
        {
            if(s1.charAt(i)!= ' '){
                count++;
            }

        }
        System.out.println("Total number of count in a string " +count);
    }

}
