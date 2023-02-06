package NumberPatternPrograms;
/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
 */
public class Number_5 {
    public static void main(String args[]) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (k =i-1; k >= 1; k--) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}