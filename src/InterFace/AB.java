package InterFace;
/*
interface multiple inheritace , hybrid inheritance ko achive karane me use hota he.
And both interface ki both method ko class ke andar override karwana compulsary hota he.
 */
interface AB {
    void show();
}
interface AC{
    void disp();
}
class tes implements AB,AC{
    public void show(){
        System.out.println("This is body of show method");
    }

    public  void disp(){
        System.out.println("This is body of disp method");
    }

    public static void main(String args[]){
        tes obj = new tes();
        obj.show();
        obj.disp();
    }
}
