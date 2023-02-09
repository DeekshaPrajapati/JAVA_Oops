package Binding;

public class DynamicBin_2 {

    void eat(){
        System.out.println("animal is eating...");
    }
}

class Dog extends DynamicBin_2{
    void eat(){
        System.out.println("dog is eating...");
    }

    public static void main(String args[]){
        DynamicBin_2 a=new Dog();
        a.eat();
    }
}
// yaha per jab main class me eat method ko check karega to ya to non-static varctual type ka method he isko bo statically bind karke
// nahi kar sakta, or compiler yak instruction generate kar dega "invokeVirtual" jissa compilar ko pata chal gya ke isko huma dynamically
// chaeck karne jana he ke small "a" variable me object kis class ka he , ab us class me jakar check karega ki , bo object override hua he
// yadi hua he to bo execute karke dedaga, yahi dynamic binding hoti he.


// yaha per data ki binding type of object ka basis per ho rahi he yaha humara object Dog() he isliya ya "dog is eating" print karega.
