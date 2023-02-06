package ThisKeyword;
/*
this keyword ko hum method me as a perameter bhi use kar sakte he
# this keyword can be used to pass as an argument in the method call
 */
public class this_4 {
    void m1(this_4 obj){
       System.out.println("this is a m1 method");
    }

    void m2(){
        m1(this);
    }
    public static void main(String args[]){
        this_4 obj = new this_4();
        obj.m2();
    }
}
