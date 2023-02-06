package Array;
// Program to Remove Duplicate Element in an array // jab humara array ke all eleemnt pahle se sorted ho tab ya logic hoga.
public class RemoveDuplicateElement {

    public static void main(String args[])
    {
        int a[] = new int [] {1,2,3,4,2,6};
        int j=0;

        for(int i=0; i<a.length-1;i++)
        {
            if(a[i] !=a[i+1])
            {
                a[j] = a[i];
                j++;
            }
        }
         a[j] = a[a.length-1];
        for(int i=0; i<j; i++)
        {
            System.out.println(a[i]+"");
        }
     }
}
