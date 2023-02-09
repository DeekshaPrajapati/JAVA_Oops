package Collection.HashSet;

import java.util.HashSet;
import java.util.Iterator;

// yaha HashSet duplicate element allow nhi karta he.
public class HashSetExample2 {

    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        set.add(null);
        set.add(null);  // HashSet only one null value allow karta he.

        //Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
