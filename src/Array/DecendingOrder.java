package Array;
// Program to sort the elements of an array in descending order
public class DecendingOrder {

    public static void main(String args[]){

        int a[]= {2, 78, 5 ,23 ,4 ,7 ,6};

        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length;j++)
            {
                int temp =0;
                if(a[i]<a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);
        }
    }
}
