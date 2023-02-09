package Collection.ArrayList;

import java.util.ArrayList;

public class ArrayList_3 {

    // Collection C Constructor= yadi huma apne first array ki all value kisi dusra array me store karwani he to bhha hum first array
    // ka reference variable second array me as a argument pass kar dega to all value second array me ajygyi.

    public static void main(String[] args) {

        ArrayList a3 = new ArrayList();
        a3.add(10);
        a3.add("deeksha");
        a3.add('S');

        ArrayList a4 = new ArrayList(a3);
        System.out.println(a4);
    }
}
