package Array;

//Program to print the elements of an array in reverse order
public class ReverseElement {

    public static void main(String args[])
    {
        int a[] = new int[] {1,2,3,4,5,6,7};
        System.out.println("Original array: ");
        for(int i= 0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("After in reverse order elemnt");
        for(int i=a.length-1; i>=0; i--){
            System.out.println(a[i]);
        }
    }
}
