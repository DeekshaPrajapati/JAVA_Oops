package ThisKeyword;
/*
this keyword can be used to pass as an argument in the constructor call
 */
public class this_5 {

    this_5(teso ob) {
    System.out.println("this is a constructor");
    }
}
    class teso {
        void m1(){
            this_5 t1 = new this_5(this);

        }
        public static void main(String args[]){
            teso ob = new teso();
            ob.m1();
        }
    }

