package Array;
// Program to Print Odd and Even Numbers from an array
public class EvenOddNumberPrint {

    public static void main (String args[])
    {
        int a[] = new int[] {1,2,6,5,9,7,8,4};
        System.out.println("Even Number");
        for(int i=0; i<a.length; i++)
        {
            if(a[i] %2 == 0){
                System.out.println(a[i]);
            }
        }

        System.out.println("Odd NUmber");
        for(int i=0; i<a.length; i++)
        {
            if(a[i]%2 !=0){
             System.out.println(a[i]);
            }
        }
    }
}
