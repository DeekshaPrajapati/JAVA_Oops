package Logical_Programs;

public class greaternumber {
    public static void main(String args[]){
//        int a=10,b=20;
//        if (a>b) {
//            System.out.printf("a is greatest");
//        }
//        else{
//            System.out.printf("b is greatest");
//        }
//        int a=10,b=20,c=30;
//        if(a>b) {
//
//            if (a > c) {
//                System.out.printf("a is greatest");
//            } else {
//                System.out.printf("c is greatest");
//            }
//        }
//      else if(b>c){
//            System.out.printf("b is greatest");
//            }
//      else{
//            System.out.printf("c is greatest");
//        }
        int a=10,b=20,c=30;
        if(a>b && a>c){
            System.out.printf("a is greater");
        }
        else if(b>a && b>c){
            System.out.printf("b is greater");
        }
        else{
            System.out.printf("c is greater");
        }
   }
}
