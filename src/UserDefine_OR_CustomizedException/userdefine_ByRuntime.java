package UserDefine_OR_CustomizedException;
/*
Runtime exception ko user define exception me use karne ke liya hum class ko extends karte he RuntimeException se.
 */

/*
     yaha per hum unchecked or Run time exception ke throe user define exception kese crete karte he ya bo he.
 */
public class userdefine_ByRuntime extends RuntimeException {

    userdefine_ByRuntime(){
        super("you are under age");
    }

    userdefine_ByRuntime(String msg){
        super("msg");
    }

}
class voating2{
    public static void main(String args[]) throws userdefiException {
        int age=17;
        if (age<18){
            throw new userdefine_ByRuntime("you not elagiable for vote because your age less then 18"); // yaha hum try catch bhi laga sakte the
        }
        else{
            System.out.println("you are eligble for vote");
        }

    }
}
