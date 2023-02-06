package Array;
//Program to print the sum of all the items of the array
public class SumElementInArray {

    public static void main(String args[])
    {
        int a[] ={2,5,1,3,6};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum= sum+a[i];
        }
        System.out.println("Sum of the all array element  " +sum);
    }
}
