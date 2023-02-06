package Logical_Programs;
/*
by using third variable
without using 3rd variable
 */
public class SwapNumber {
    public static void main(String args[]){
        int a=10, b=20;
//         int t;
//        t=a; //t=10
//        a=b; //a=20
//        b=t; //b=10
        a= a+b; // a=30
        b= a-b;// b=10
        a= a-b; //a=20
        System.out.printf("value of a"+a);
        System.out.printf('\n'+"value of b"+b);

    }
}
