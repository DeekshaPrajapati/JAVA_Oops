package Array;
// How to remove a element in an array

public class RemoveElementInArray {

    public static void main(String args[])
    {
        int a[] = new int [] {10,20,30,40,50,60};
        int delElem= 30;

        for(int i=0; i<a.length; i++)
        {
            if(delElem==a[i])
            {
                for(int j=i; j<a.length-1; j++){
                    a[i] = a[j+1];
                }
                break;
            }

        }
        for(int i=0; i<a.length-1; i++){
            System.out.println(a[i]);
        }

    }
}
