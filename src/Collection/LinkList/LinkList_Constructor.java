package Collection.LinkList;

// Empty constructor = Linkedlist() , ya yak empty link list create karke dedega.

import java.util.LinkedList;

public class LinkList_Constructor {

    public static void main(String[] args) {

        LinkedList s = new LinkedList(); // empty constructor

        s.add("deksha");
        s.add("sunil");
        s.add(10);
        s.add(20);

        System.out.println(s);
    }
}
