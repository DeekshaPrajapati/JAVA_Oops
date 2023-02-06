package ThisKeyword;
/*
this keyword can be used to invoke current class method (implicitly)
 */
public class this_2 {

    void show(){
        System.out.println("hello...hii");
    }

    void displ(){
        show();       //this.show(); ....both line are valid here compiler alredy add this keyword
    }
    public static void main(String args[]){
        this_2 ob = new this_2();
        ob.displ();
    }
}
