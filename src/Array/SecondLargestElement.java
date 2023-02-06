package Array;
// Program to Find 2nd Largest Number in an array
public class SecondLargestElement {

    public static void main(String args[])
    {
        int temp=0, size;
        int a[] = {10,20,30,45,60,80,100};
        size=a.length;

        for(int i=0; i<size; i++)
        {
            for(int j=i+1; j<size; j++)
            {
                if(a[i]<a[j])
                {
                    temp= a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        System.out.println("Second Largest Element in Array:: " +a[1]);
    }
}
