package Array;
// Program to sort the elements of an array in ascending order
public class AssendingOrder {

    public static void main(String args[])
    {
        int a[] ={7,8,3,2,0,-1,-2,-45};


        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                int tmp = 0;
                if (a[i] > a[j])
                {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
//prints the sorted element of the array
            System.out.println(a[i]);
        }
    }
}
