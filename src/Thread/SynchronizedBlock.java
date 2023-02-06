package Thread;
/*
Synchronized block= jab hum ya chate he ki humare program ka few line of code hi synchronized ho all code synchronized na
ho to hum synchronized block ka use karte he. jiisa thred ka waiting time of period decirese ho jyga.
ya object label lock ke liya use hota he
 */
public class SynchronizedBlock {

    int totalSeat =10;
     void bookSeat(int seats){
         System.out.printf("this is method");
         System.out.printf("this is method");
         System.out.printf("this is method");
         synchronized (this) { // here this refer a reference of the object
             if (totalSeat >= seats) {
                 System.out.printf("seat book successfully");
                 totalSeat = totalSeat - seats;
                 System.out.printf("seat left" + totalSeat);
             } else {
                 System.out.printf("seat can not be booked");
                 System.out.printf("seat left" + totalSeat);
             }
         } }
}
class MovieBookAp extends Thread{
    static SynchronizedBlock b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }
    public static void main(String args[]){
        b=new SynchronizedBlock();

        MovieBookAp diksha = new MovieBookAp();
        diksha.seats=7;
        diksha.start();

        MovieBookAp kavya = new MovieBookAp();
        kavya.seats=6;
        kavya.start();


    }
}
