package Array;

// Program to print the duplicate elements of an array
public class PrintDuplicateElement {

    public static void main (String args[])
    {
        int a[] = new int[] {1,3,3,4,5,6,6};

        for(int i=0; i<a.length; i++){

            for(int j= i+1; j<a.length; j++)
            {
                if(a[i] == a[j])
                {
                    System.out.println(a[i]);
                }
            }
        }

    }
}
