package Array;

public class InsertArray {

    public static void main(String args[])
    {
        int[] a={10,20,30,40,50};
        int pos=3,i;
        int element=100;
        for(i=a.length-1;i>pos-1;i--)
        {
            a[i]=a[i-1];
        }
        a[pos-1]=element;
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]+ " ");
        }
    }
}
