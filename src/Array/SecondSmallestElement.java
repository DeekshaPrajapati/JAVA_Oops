package Array;
//  Program Find 2nd Smallest Number in an array
public class SecondSmallestElement {

    public static void main (String args[])
    {
        int temp=0 , size;
        int a[] = new int [] {10, 52, 30, 40, 20};
        size= a.length;

        for(int i= 0; i<size; i++)
        {
            for(int j=i+1; j<size; j++)
            {
                if(a[i]>a[j])
                {
                    temp= a[i];
                    a[i]= a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second Smallest Element is ::" +a[1]);
    }
}
