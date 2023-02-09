package Collection.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<String> set=new LinkedHashSet();
               set.add("One");
               set.add("Two");
               set.add("Three");
               set.add("Four");
               set.add("Five");
               set.add(null);
               set.add("one"); // duplicate element allow
               set.add(null);  // only one null value allow

    Iterator<String> i=set.iterator();
               while(i.hasNext())
    {
        System.out.println(i.next());
    }
}
}
