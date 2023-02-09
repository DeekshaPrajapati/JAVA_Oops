package ClassLoading;

// Yadi hum kisi bhi class ka object nhi bnyga to only c class ka data print hoga.

public class StaticLoading_1 {

    static{
        System.out.println(" A is loaded");
    }
}
class B1  {

    static{
        System.out.println(" B1 is loaded");
    }
}
class c1  {

    static{
        System.out.println("C1 is Loaded");
    }
    public static void main(String args[]) {


    }


}
