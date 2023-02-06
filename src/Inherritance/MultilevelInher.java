package Inherritance;

public class MultilevelInher {

    void show(){
        System.out.println("It is show method");
    }
}

class level1 extends MultilevelInher {

    void disp(){
        System.out.println("It is display method");
    }
}

class level2 extends level1 {

    void sum(){
        System.out.println("It is sum method");
    }

    public static void main (String args[]){
        level2 obj = new level2();
        obj.show();
        obj.disp();
        obj.sum();
    }
}