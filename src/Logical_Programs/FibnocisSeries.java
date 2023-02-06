package Logical_Programs;
/*
fibnocis series are sum of previous two numbers sum
0 1 1 2 3 5 8 13
 */
public class FibnocisSeries {
    public static void main(String args[]){
        int a=0, b=1, c;
        for(int i=1; i<=10; i++){
            c=a+b; //previous 2 numbers sum
            System.out.printf(String.valueOf(c));
            a=b;
            b=c; // number swapping
        }

    }
}
