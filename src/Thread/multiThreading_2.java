package Thread;

public class multiThreading_2  extends Thread{

    public void run(){
        System.out.printf("1st thread");
    }
}

 class test3 extends Thread{
     public void run(){
         System.out.printf("2st thread");
     }

}
class main{
    public static void main(String args[]){
        multiThreading_2 obj = new multiThreading_2();
        obj.start();
                                 // perform multipletask from multiple task
        test3 ob = new test3();
        ob.start();

    }
}