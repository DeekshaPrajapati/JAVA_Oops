package Inherritance;

class example {

    void disp(){
        System.out.println("It is display");
    }
}
class quest extends example{

    public static void main(String args[]){
        quest s1 = new quest();
        s1.disp();
    }
}
