package Collection.Cursor;

// Iterator is a interface it is  used in the Collection framework to retrieve elements one by one.
// we are directally not create the object of the iterator.

// Methods of Iterator=>
/*
next() = ya method iterator pointer ko age lekar jata he , or jaha pointer milta he us eleemnt ko return kar deta he.
hashNext()= ya method check karega ke collection ke andar element available he ya nhi to ya true false me value return karta he.
remove()= element ko remove karta he.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Iterator_1 {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();

        l.add(0,10);
        l.add(1,20);
        l.add(2,30);

        Iterator itr = l.iterator();
        while(itr.hasNext()){  // hasNext() method true value return karta he
            System.out.println(itr.next());
        }
    }
}
