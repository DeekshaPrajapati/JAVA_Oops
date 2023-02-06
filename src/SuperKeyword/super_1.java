package SuperKeyword;
/*
super keyword refer to the immediate parent class instance variable
 */
public class super_1 {
    int a =20;

}
class super_2 extends super_1{
    int a=30;
    void show(int a){
        System.out.println("show method value"+a); // value of show method
        System.out.println("this is my super keyword value of a"+ this.a); //refer current class
        System.out.println("this is my parent class value of a"+ super.a); //Super keyword refer parent class
    }

    public static void main(String args[]){
        super_2 obj = new super_2();
        obj.show(40);
    }
}
