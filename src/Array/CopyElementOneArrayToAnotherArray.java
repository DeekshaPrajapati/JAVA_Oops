package Array;
//Program to copy all elements of one array into another array

public class CopyElementOneArrayToAnotherArray {

    public static void main(String args[])
    {
        int a1[] = new int[] {4,5,6,7,8,9};

        int a2[] = new int[a1.length];

        for(int i=0 ;i<a1.length; i++)
        {
            a2[i] = a1[i];
        }

        System.out.println("Original Array");
        for(int i=0;i<a1.length; i++){
            System.out.println(a1[i]);
        }
        System.out.println();

        System.out.println("Eleemnt in new Array");
        for(int i=0; i<a2.length; i++){
            System.out.println(a2[i]);
        }
    }


}
