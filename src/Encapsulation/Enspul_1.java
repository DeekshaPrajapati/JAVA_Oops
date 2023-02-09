package Encapsulation;
/*
//  ***************************Encapsulation*****************************
// Encapsulation in java is a mechanisiam of wrapping the data (variable) and code acting on the data (method) together
// as a single unit. Is called a Encapsulation.

 // ************************Real world Example*********************
 // yak capsul hota he usme hum main medician ko yak sigle unit me bind kar dete he that are a encapsulation.
 // car ka engin he bo driver ko to show nhi hota he bo yak jagh bind ho jata he.

 // *********************How to achive Encapsulation*************************
 //1) Declare variable of a class as private. (Data Showding)
# All variable private declare hona chiya, ya private variable class ke andar hi use ho pyga class ka bhar nhi
#  public getter, setter method banyga jo ki hmara data ko view and modify karana me kam aygyi


// Data encapsulation hides the private methods and class data parts

 */
public class Enspul_1 {

    private int id; // Data hiding

    public void show(int id1) { // getter method
        id = id1;
    }

    public int disp() { // setter method
        return id;
    }

}
class toto {
    public static void main(String args[]){
        Enspul_1 obj = new Enspul_1();
        obj.show(10);                  // Data display

        System.out.println(obj.disp()); // Data view

    }


}