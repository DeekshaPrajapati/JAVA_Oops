package DataShadwing_Datahinding;

public class DataShowding {
    //instance var
    String name="Deeksha";

    class A{

        String name="Arjun";

        public void print(){
            System.out.println(name);
            System.out.println(DataShowding.this.name);
        }

    }



    public static void main(String[] args) {

        DataShowding dataShowding= new DataShowding();

        DataShowding.A innerClassObject= dataShowding.new A();

        innerClassObject.print();


    }
}
