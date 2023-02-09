package CallByValue_CallByReference;

public class CallByReference_Example {

    int a=100;

    void disp(CallByReference_Example obj){

        obj.a= obj.a+20;
    }

    public static void main(String[] args) {

        CallByValue_Example obj = new CallByValue_Example();

        System.out.println("Before calling a=" + obj.a); // yaha per yak hi memory me 2no value store ho rahi he.

        //obj.disp(obj);

        System.out.println("After calling a= " + obj.a);
    }
}
