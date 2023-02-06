package Array;
// Program to print the elements of an array present on even position
public class EvenPosition {

    public static void main(String[] args) {


        int [] arr = new int [] {5,6,8,3,7,2,9};

        System.out.println("Elements of given array present on even position: ");

        for (int i = 2; i < arr.length; i = i+2) {
            System.out.println(arr[i]);
        }
    }
}
