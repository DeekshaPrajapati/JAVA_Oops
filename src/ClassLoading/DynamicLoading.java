package ClassLoading;

// Jab compiler ko nhi pata hota he ki kon-kon se class load hone bali he usko hum dynamic loading bolta he.

import static java.lang.Class.forName;

public class DynamicLoading {

    DynamicLoading(){
        System.out.println(" dynamic loading constructor");
    }
    static{
        System.out.println(" dynamicloading static block");
    }
}

class A{

    A(){
        System.out.println("A class of constructor");
    }

    static{
        System.out.println("A class of static block");
    }
}
class Bb{

    Bb(){
        System.out.println("Bb class constructor");
    }

    static{
        System.out.println("Bb class of static block");
    }

    public static void main(String[] args) {

        try{
          Class c = Class.forName(args[1]);                      // Dynamic binding ke liya hum class class ki static method forName() method me "args" as aargument
        }                                                      // send karna padega,
        catch (Exception e){                                   // forName() method me jo hum argument pass krega to uska hi accoring hum class ka data print hokar milega.
            System.out.println(e);
        }
    }
}