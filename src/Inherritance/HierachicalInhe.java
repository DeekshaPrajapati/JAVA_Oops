package Inherritance;

public class HierachicalInhe {

    void show(){
        System.out.println("This is show method");
    }
}
class hiera1 extends HierachicalInhe{

    void disp(){
        System.out.println("This is display method");
    }
}
class hiera2 extends HierachicalInhe{

    void sum(){
        System.out.println("This is sum method");
    }
    public static void main (String args[]){
        hiera2 obj1 = new hiera2();
        obj1.show();
        obj1.sum();

        hiera1 obj2 = new hiera1();
        obj2.disp();
        obj2.show();
    }
}