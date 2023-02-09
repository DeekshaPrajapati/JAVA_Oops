package ClassLoading;

// Static Loading = Jab Compiler ko pata hota he ki kon-kon se class load hone bali he usko hum static loading khate he.


// yadi hum all class ka object bana lega to all class ka data print ho jyga.

//***************Isi trah hum static loading hoti he.
public class StaticLoading {

    static{
        System.out.println(" A is loaded");
    }
}
class B  {

    static{
        System.out.println(" B is loaded");
    }
}
class c  {

    static{
        System.out.println("C is Loaded");
    }
    public static void main(String args[]) {
        B b= new B();
        StaticLoading s= new StaticLoading();

    }


}