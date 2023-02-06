package Logical_Programs;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.printf("Enter a number");
        int n= s.nextInt();
       // int n= 5432;
        int rem,  rev = 0;
        while (n != 0) {

            rem = n%10; //modulas
            rev= rev*10+rem;
            n= n/10; //divide

        }
        System.out.printf("Reverse no. is "+ rev);
    }
}