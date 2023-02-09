package Collection.LinkList;

import java.util.LinkedList;

public class LinkList_Methods {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.add("deeksha");
        l.add(20);
        l.add(2, 30);
        l.add('s');
        l.add(0.0256);
        l.add(null);
        l.add(null);
        l.add("deeksha");

        l.get(2);
        l.remove(3);
        l.set(4,"abc");
        l.indexOf(5);
        l.lastIndexOf(null);
        l.getFirst(); // yadi 1st element get karwana he to
        l.getLast(); // yadi last element get karwana he to
        l.addFirst("ddf");// yadi 1st per koi element add karwana he
        l.addLast("df");
        l.removeFirst();
        l.removeLast();
        System.out.println(l);
    }
}
