package DataShadwing_Datahinding;

public class DataShowding_1 {
   // when we same refence name of the variables, the collison occurs anf prefence will goes  to the local/current variable.
    int x= 20;

    void  showPrint(){
        int x= 30;
        System.out.println(x);
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        DataShowding_1 dataShowding_1= new DataShowding_1();
        dataShowding_1.showPrint();
    }
}
