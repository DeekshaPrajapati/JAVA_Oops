package Collection.LinkList;

import java.util.ArrayList;
import java.util.LinkedList;

// Collection c Constructor , ya constructor yak collection ke object ko dusra linklist me insert karwa dega.
public class LinkList_Constructor2 {

    public static void main(String[] args) {

        ArrayList a = new ArrayList();

        a.add("deksha");
        a.add("sunil");
        a.add(10);
        a.add(20);

        LinkedList k= new LinkedList(a);

        k.add(4);
        k.add("xyz");
        k.add('g');

        System.out.println(k);
    }
}
