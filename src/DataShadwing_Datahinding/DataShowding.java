package DataShadwing_Datahinding;

// DataShaowding in case of  inner class
public class DataShowding {
    //instance var
    String name="Deeksha";

    class A{   // Inner class he .

        String name="Arjun"; // local variable

        public void print(){
            System.out.println(name);
            System.out.println(DataShowding.this.name);
        }

    }



    public static void main(String[] args) {

        DataShowding dataShowding= new DataShowding(); // main class object

        DataShowding.A innerClassObject= dataShowding.new A(); // inner class object

        innerClassObject.print();


    }
}
