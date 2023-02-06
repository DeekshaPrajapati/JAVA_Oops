package UserDefine_OR_CustomizedException;
/*
customized or user exception bo hote he je user ke throw create kiya jate he , iske throw hum  checked and unchecked
both type ke exception create kar sakte he.
# jab bhi hum checked exception ko use karega to hume 1 hi class ko extends karna pdega Exception se.
 */

/*
     yaha per hum checked or compile time exception ke throe user define exception kese crete karte he ya bo he.
 */
public class userdefiException extends Exception {

    userdefiException(){
        super("you are under age");
    }

    userdefiException(String msg){
        super("msg");
    }

}
class voating{
    public static void main(String args[]) throws userdefiException {
        int age=17;
        if (age<18){
            throw new userdefiException("you not elagiable for vote because your age less then 18"); // yaha hum try catch bhi laga sakte the
        }

        else{
            System.out.println("you are eligble for vote");
        }

    }
}