package Collection.Cursor;
// listIterator => ListIterator are interally inherit the iterator, It is a child interface of Iterator.
//ListIterator are called method and inteface both.

// Methods of ListIterator=> 1) hasNext () · #2) next () · #3) hasPrevious () · #4) previous () · #5) nextIndex () · #6) previousIndex () · #7) remove () ·

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_1 {

    public static void main(String[] args) {

        ArrayList a= new ArrayList();

        a.add("deksha");
        a.add("sunil");
        a.add(10);
        a.add(20);

        ListIterator itr = a.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
