package DataShadwing_Datahinding;
//Assume DataHiding == Account.java

//Data Hiding is nothing but an Encasulation, allthe members are private , to access the members outside the class we hve to
// use getter and setter, to access the set the value of the member.

// DataHinding  yak Encapsulation ka jesa he he jisme humra data memeber private hote he , jinko hum class ke andar he access
// kar sakte he, class ke bhar access nhi kar sakte he, outside of class access karne ke liya huma getter ,seeter method ban na padega,
public class DataHinding_1 {

    private double balance;


    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }
}
