package ThisKeyword;
/*
# this keyword is a reference variable and it is refer a current object.
# yadi instance var. and loacal var. both same he to to value ko insilize karne ke liya this keyword ka use karte he.
#instace var. always object ko refer karta he.
 */

/*
1 USe := used to refer a current class instance varible
 */
public class this_1 {
    int i;  // instance variable
    void show(int i){
        this.i=i;  //here this.i refer a instance variable  And i refer a local variable.
    }
    void disp(){
        System.out.println("this is a value of i----"+i);
    }
}
class xyz {
    public static void main(String args[]){
        this_1 obj = new this_1();
        obj.show(100);
        obj.disp();
    }
}
