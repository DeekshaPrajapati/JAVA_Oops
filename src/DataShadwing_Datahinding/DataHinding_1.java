package DataShadwing_Datahinding;
//Assume DataHiding == Account.java

//Data Hiding is nothing but an Encasulation, allthe members are private , to access the members outside the class we hve to
// use getter and setter, to access the set the value of the member.

public class DataHinding_1 {

    private double balance;


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
