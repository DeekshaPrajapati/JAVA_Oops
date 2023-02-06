package Logical_Programs;
/*
year % 4 = leapyear he.
year%100= not leapyear.
year%400=leapyear he.
 */
public class LeapYear {

    public static void main(String args[]){
        int year = 2016;

        if(year%4==0){

            if(year%100==0){

                if(year%400==0){
                    System.out.printf("year are leapyear");
                }
                else{
                    System.out.printf("year are not leapyear");
                }
            }
            else{
                System.out.printf("year are leap year");
            }
        }
        else{
            System.out.printf("year are not leapyear");
        }
    }
}
