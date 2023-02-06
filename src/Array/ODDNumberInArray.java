package Array;

public class ODDNumberInArray {

    public static void main(String args[]){
        int a[] ={7,5,4,2,6,3};

        for(int i=0; i<a.length; i++)
        {
            if(a[i]%2!=0)
            {
                System.out.println("Odd Number--" +a[i]);
            }
        }
    }
}
