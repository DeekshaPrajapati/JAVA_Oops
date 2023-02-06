package Logical_Programs;

public class Leapyear_2 {
   public static void main(String args[]){

       int year=2016;
       if((year%4==0) || (year%400==0 && year%100!=0 )){

           System.out.printf("year are leap year");
       }
       else{
           System.out.printf("year are not leap year");
       }
   }
}
