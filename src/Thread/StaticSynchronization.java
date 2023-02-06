package Thread;

/*
# Static Synchronization = ya class label lock ke liya use hota he.
And Static synchroz. ka use isliy karte ke kuki  abhi to hum yak hi object bana rhe the but yadi hum multiple object bana dete he to
again data inconsistency ka problem occur hone laga ga and humara output constant hoga, issi problem ke solution ke liya hum static synchronization
ka use karte he.
                To humne jo method banaya he uske synchronized keyword ka aga only static keyword add kar dega, and variable ko bhi static
                bana dega.
 Syntax:-
 static int seats =10;
 static synchronized void bookSeat(){
  }
 */
public class StaticSynchronization {

   static int totalSeat =20;
   static  synchronized void bookSeat(int seats){
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

class MyThread1 extends Thread{
    StaticSynchronization b;
    int seats;
    MyThread1(StaticSynchronization b, int seats){
        this.b=b;
        this.seats=seats;
    }
    public void run(){
        b.bookSeat(seats);
    }
}

class MyThread2 extends Thread{
    StaticSynchronization b;
    int seats;
    MyThread2(StaticSynchronization b, int seats){
        this.b=b;
        this.seats=seats;
    }
    public void run(){
        b.bookSeat(seats);
    }
}
class MovieBookA {

    public static void main(String args[]){
        StaticSynchronization  b1=new  StaticSynchronization();

        MyThread1 th1 = new MyThread1(b1,7);
        th1.start();
        MyThread1 th2 = new MyThread1(b1,6);
        th2.start();

        StaticSynchronization  b2=new  StaticSynchronization();

        MyThread2 th3 = new MyThread2(b2,5);
        th3.start();

        MyThread2 th4 = new MyThread2(b2,9);
        th4.start();


    }
}
