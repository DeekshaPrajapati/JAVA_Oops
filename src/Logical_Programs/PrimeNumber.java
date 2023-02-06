package Logical_Programs;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter a number");
        int no = s.nextInt();
        //int no = 7;
        int temp = 0;
        for (int i=2; i<=no-1; i++) {

            if(no%i==0){
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.printf("number is prime "+ no);
        }
       else{
            System.out.printf("number is not prime "+ no);
        }
    }
}