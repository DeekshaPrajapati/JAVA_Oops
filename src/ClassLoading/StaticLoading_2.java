package ClassLoading;

// yadi hum classes ko inherit karte he and kisi bhi class ka object nhi banate he to bhi all class ka data print ho jyga.

public class StaticLoading_2 {

    static{
        System.out.println(" A is loaded");
    }
}
class B2 extends StaticLoading_2  {

    static{
        System.out.println(" B2 is loaded");
    }
}
class c2 extends B2  {

    static{
        System.out.println("C2 is Loaded");
    }
    public static void main(String args[]) {

    }


}
