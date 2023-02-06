package ExceptionHandling;
/*
Checked Exception / Compile time exception
Unchecked Exception/ Run time exception
 */

import java.io.FileInputStream;

public class Handling_1 {

    public static void main(String args[]){ // compile nhi hoga program.
        //FileInputStream fis = new FileInputStream("D:/abc.txt"); // compile time showing exception please handle exception by throws or try catch block.

        int a=100;
       int d= 100/0;
       System.out.println(d); // Exception throw karega , program compile ho jyga lakin run time per exception dedaga.
    }
}
