package Thread;
/*
A thread is a single sequential flow of control within a program.

2way to create thread 1) Thread class
                      2) Runnable (interface)
 */
// this is a 1st way to create thread
//public class thread_1  extends Thread{ // 1st step extends thread class
//
//    public void run(){      //2nd step override run method
//        System.out.printf("thread are start");
//    }
//
//    public static void main(String args[]){
//        thread_1 th= new thread_1();       //3rd step create object of the class
//        th.start(); // 4th step start thread
//    }
//
//}
  // 2nd way to create thred by using runnable interface
// this is a best way to create thred kuki koi class A class B ko extends bhi kar sakti he and Runnable interface ko implement
// bhi kar rahi he , jissa hum thread bhi use kar skte he isliya ya best way he.
public class Test  implements Runnable{

    public void run(){      //2nd step override run method
        System.out.printf("thread are start");
    }

    public static void main(String args[]){
        Test th= new Test();       //3rd step create object of the class
        Thread t = new Thread(th); // create thred object
        t.start(); // 4th step start thread
    }

}