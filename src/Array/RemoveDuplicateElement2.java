package Array;

import java.util.HashSet;

//Program to Remove Duplicate Element in an array,,,,// jab humare pass array ke element unsorted he tab.
public class RemoveDuplicateElement2 {

    public static void main(String args[])
    {
        int a[] = new int [] {1,2,3,4,2,6};

         HashSet<Integer> hs = new HashSet<Integer>();      // yaha hum hash set class ka object banyga.

        for(int i=0; i<a.length; i++)
        {
            hs.add(a[i]);
        }
        for(int no : hs)  // for each loop he , yaha hum hash set ke element ko 1- 1 karke print karwa dega.
        {
           System.out.println(no);
        }
    }
}
