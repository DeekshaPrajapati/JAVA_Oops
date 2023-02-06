package Logical_Programs;

import java.util.Scanner;

//5 = 5*4*3*2*1=120
public class Factorial {

    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.printf("Enter number");
        int n= s.nextInt();
        //int n=5;

        int fact=1;
        //for(int i=n; i>=1;i--)
        for(int i=1; i<=n; i++){
            fact= fact*i;

        }
        System.out.printf(String.valueOf("Factorial is " + fact));
    }
}
