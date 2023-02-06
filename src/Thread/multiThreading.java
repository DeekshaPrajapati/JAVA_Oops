package Thread;

public class multiThreading extends Thread{

    public void run(){
        System.out.printf("thread task");
    }

    public static void main(String args[]){ // main thread ya jvm create karta he
        multiThreading mt =new multiThreading();  // second thread
        mt.start();  // performing single task from single thread.

        multiThreading tm = new multiThreading(); // third thread
        tm.start(); // performing single task from multiple thread.
    }

}
