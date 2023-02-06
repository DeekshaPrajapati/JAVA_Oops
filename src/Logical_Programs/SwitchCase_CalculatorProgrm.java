package Logical_Programs;

import java.util.Scanner;

public class SwitchCase_CalculatorProgrm {

    public static void main(String args[]) {
        String yn;
        do {
            Scanner s = new Scanner(System.in);
            System.out.printf("Enter first number");
            int no1 = s.nextInt();
            System.out.printf("Enter second number");
            int no2 = s.nextInt();
            System.out.printf("Select Symbol(+,-,*,/");
            String symb = s.next();
            int res;
            switch (symb) {

                case "+":
                    res = no1 + no2;
                    System.out.printf(String.valueOf(res));
                    break;
                case "-":
                    res = no1 - no2;
                    System.out.printf(String.valueOf(res));
                    break;
                case "*":
                    res = no1 * no2;
                    System.out.printf(String.valueOf(res));
                    break;
                default:
                    System.out.printf("invalid symbol");
                    break;
            }
            System.out.printf("do you want to continue press yes or no");
            yn=s.next();
        } while(yn.equals("y") || yn.equals("Y"));
    }
}