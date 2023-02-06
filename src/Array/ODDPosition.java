package Array;
// Program to print the elements of an array present on odd position
public class ODDPosition {

    public static void main(String args[])
    {
        int a[] ={5,9,2,4,8};
        for(int i=1; i<a.length;i=i+2)
        {
            System.out.println(a[i]);
        }
    }
}
