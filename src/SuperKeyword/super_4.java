package SuperKeyword;
/*
differnt class ke andar same method use karke value ko print karwa sakte he by super keyword
 */
public class super_4 {
    void m1(){
        System.out.println("this is m1 method");
    }

}

class tete extends super_4{
    void m1(){
        System.out.println("this is child classs m1 method");
    }

    void show(){
        m1();  // ya child class ka method ki value ko print karega
        super.m1(); // parent class ka method ki value ko print karega
    }
    public static void main(String args[]){
        tete ob = new tete();
        ob.show();
    }
}
