package ScannerClass;
/*
Scanner class is used to take input by user.
 */
import java.util.Scanner;

public class scanner_1 {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        System.out.printf("Enter name");
        String name = s.next();
        System.out.printf("Enter grnder");
        char gender = s.next().charAt(0);
        System.out.printf("Enter Age");
        int age = s.nextInt();
        System.out.printf("Enter phone number");
        long phoneNo = s.nextLong();
    }
}
