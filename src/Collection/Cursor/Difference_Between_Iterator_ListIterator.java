package Collection.Cursor;

public class Difference_Between_Iterator_ListIterator {
    /*
               Iterator                                         ListIterator
     1) We can get Iterator cursor by iterator()          1) we can get ListIterator cursor by ListIterator()
        method.                                              method.
        Iterator itr= l.iterator();                        ListIterator itr = l.listIterator();
     2.) Iterator cursor can we used with any            2) ListIterator cursor can be used only with List implemented
         collection object.                                classes ie. ArrayList , LinkList, vector, stack.

     3.) Iterator methods are hasNext(), next(),        3.) ListIterator methods are hasNext(), next(), hasprevious(),
        remove().                                          previous(),remove(),set().

     4.) By using Iterator cursor , we can retrive    4.) By using ListIterator cursor we can retrive the element foreword
        the elements only in foreword direction.          and backword direction.

     5.) By using iterator cursor we can read and     5.) By using Listiterator cursor we can read , remove, replace and
         remove the element.                              add the element.
     */
}
