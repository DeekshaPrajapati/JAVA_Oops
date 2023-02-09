package CallByValue_CallByReference;

public class CallByValue_Example {

    int a= 100;

    void disp(int a){

        a= a+20;
    }

    public static void main(String[] args) {
        CallByValue_Example obj = new CallByValue_Example();
        System.out.println("Before Calling value of a =" +obj.a);  // yaha per 100 he bo alg alg memory me jakar store hota he , isliya isne 100 hi print kiya

        obj.disp(obj.a);

        System.out.println("After calling value of a =" + obj.a);

    }
}
