package Array;
//Program to find even number in array
public class EvenNumberInArray {

    public static void main(String args[]) {

        int a[] = {1, 4, 0, 9, 8, 6, 2, 5};
        for (int i = 0; i < a.length;  i++) {

            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }
}
