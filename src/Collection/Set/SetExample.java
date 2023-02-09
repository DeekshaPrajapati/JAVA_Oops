package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set se = new HashSet();

        se.add(23);
        se.add("deksj");
        se.add(23);        // set duplicate value allow nhi karta isliya yak bar hi 23 print karega.
        se.add(null);
        se.add(null);  // set only one null value allow karta he , isliya output me yak null he print hoga.

        System.out.println(se);


    }
}
