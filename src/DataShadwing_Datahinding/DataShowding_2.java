package DataShadwing_Datahinding;

public class DataShowding_2 {
    String empName;
    int empAge;

    DataShowding_2(String empName, int empAge){
        this.empName= empName;
         this.empAge=empAge;
        System.out.println(empName+" "+empAge);
    }

    void show(){
        System.out.println(empName+" "+empAge);
    }

    public static void main(String[] args) {
        DataShowding_2 dataShowding_2= new DataShowding_2("Arjun",24);
        dataShowding_2.show();
    }
}
