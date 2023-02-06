package ThisKeyword;
/*
this keyword ko hum as a return statement use kar sakte he
#this keyword can be used to return the current class instance from the method
 */
public class this_6 {

    this_6 show(){
        System.out.println("this is a show method");
        return this;
    }
    public static void main(String args[]){
        this_6 obj = new this_6();
        obj.show();
    }
}
