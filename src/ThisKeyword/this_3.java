package ThisKeyword;
/*
this() keyword can be used invoke current class constructor
isme hum 2 constructor banyga then second bale constructor ke throw first bala constructor ko use karlege by
using this(); keyword.
 */
public class this_3 {

    this_3(){
        this(10);
        System.out.println("this is current class construtor");
    }

    this_3(int a){
      //  this();                //here print the value of 1st constructor
        System.out.println("this is perametiriged class construtor");
    }
    public static void main(String args[]){
        this_3 obj = new this_3();
      //  this_3 obj = new this_3(10);
    }
}












