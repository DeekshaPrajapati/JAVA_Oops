package String_LogicalProgram;

// Program to count the total number of vowels and consonants in a string

import java.util.Locale;

public class CountTotal_Vowel_Consonant {

    public static void main(String args[]){

        int vCount=0,cCount=0;
        String str = "This is my computer";
        str= str.toLowerCase();

        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i) == 'e' || str.charAt(i)== 'i'|| str.charAt(i)== 'o' || str.charAt(i) =='u'){
                vCount++;
            }
            else if (str.charAt(i) >= 'a' && str.charAt(i)<= 'z') {
                cCount++;

            }
        }
        System.out.println("Number of Vowels " +vCount);
        System.out.println("Number of Consonant " +cCount);
    }
}
