package Inherritance;

class ClassProperty {
    /*
      In this example we saying that a any class of all property are not inherit the another class.
      1.) Constructor are not inherit the another class.
      2.) Private method are not inherit the another class.
     */
    ClassProperty(){
        System.out.println("This is a constructor");
    }
    void show(){
        System.out.println("This is show method");
    }
    private void disp(){
      System.out.println("This is a display method");
    }
}

public class proper2 extends ClassProperty {

    public static void main(String args[]){
        proper2 obj = new proper2();
        obj.show();
    }
}
