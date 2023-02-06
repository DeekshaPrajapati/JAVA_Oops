package Thread;
/*
Synchronation in process to control the accessbility of the multiple thread to any shared resource.

Why we use synchronation ?
Because jab hum multiple thread ka use karte he to , us condition me jo humare program ka output hota he bo constant
nhi hota he, and data inconsistancy occur karta he jissa program ki performance me problems create hota he , isliya hum synchronation
ka use karte he,

2 Types of synchronization
*Process Synchronization
*Thread Synchronization = there are 2 type
     1. mutual exclusive= these are achived by
            -synchrozed method
            -synchrozed block
           - static synchrozed



How to achive synchronization?
by using synchrinized keyword,
and synchronized method = we have to use a synchronized keywoord before any method , that is called a synchronized method.
 */
// synchronized method
public class Synchro_BookSeat {

    int totalSeat =10;
    synchronized void bookSeat(int seats){
        if(totalSeat >= seats)
        {
            System.out.printf("seat book successfully");
            totalSeat = totalSeat-seats;
            System.out.printf("seat left" + totalSeat);
        }
        else{
            System.out.printf("seat can not be booked");
            System.out.printf("seat left" + totalSeat);
        }
    }
}
class MovieBookApp extends Thread{
    static Synchro_BookSeat b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }
    public static void main(String args[]){
        b=new Synchro_BookSeat();

        MovieBookApp diksha = new MovieBookApp();
        diksha.seats=7;
        diksha.start();

        MovieBookApp kavya = new MovieBookApp();
        kavya.seats=6;
        kavya.start();


    }
}