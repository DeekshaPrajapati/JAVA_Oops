package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Methods {

    public static void main(String[] args) {

        ArrayList a1 = new ArrayList();
        a1.add(0,12);
        a1.add(1,13);
        a1.add(2,14);
        a1.add(3,15);
        a1.add(4,"deeksha");
        a1.add(5,12);
        a1.add(6,null);
        a1.add(7,null);

        a1.remove(0);
        a1.clear();// remove all element
        a1.contains("deeksha"); // ya check karega ki deeksha element  humare array me present he kya to ya true false me value return karega.
        a1.size(); // kitne elements array me present he unki size display kar dega.
        a1.get(5); // ya method hum jo index value dega uska according 5 index per kon se value he bo print karke dedega.
        a1.set(6,"sunil"); // ya method humne jo index diya he uska according 6 index per sunil ko Add kar dega. ya replace ka kam karti he.
        a1.indexOf("deeksha"); // ya method humne jo value deeksha di he uska according deeksha kis index position per he, index ki value print karke dega.

        Iterator it = a1.iterator(); // ya method one by one all element ko retrive karwata jyga
        while (it.hasNext()){
            System.out.println(it.hasNext());
        }

        System.out.println(a1);

    }
}
