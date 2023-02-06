package String_LogicalProgram;

//Program to count the total number of characters in a  two string

public class CountTotal_CharatIn_Two_String {

    public static void main(String args[]){

        String s1= "My name is deeksha";
        String s2= "I live in Indore";
        int count1=0, count2=0;

        for(int i=0; i<s1.length();i++){
            if(s1.charAt(i) != ' '){
                count1++;
            }
        }
        System.out.println("First String Counting Are " +count1);

        for(int i=0; i<s2.length();i++){
            if(s2.charAt(i)!= ' '){
                count2++;
            }
        }
        System.out.println("Second String Counting Are " +count2);
    }

}
