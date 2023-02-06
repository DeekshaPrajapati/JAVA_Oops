package Abstriction;
/*
# Abstrict method ki kavhi body nhi hoti he.
# yadi kisi class ke andar abstrict method he to bo class abstrict hona compulsarry he.
# Abstrict class ke andar simple method(Concuritr method) ho sakta he.
# ydi koi normal class abstract class ko extends kar raha he to abstrict class ki abstrict method ki body ko hum
normal class me define karte he.
# Abstrict class ka kavi object nhi banta he. But reference create kar sakte he.
 */
abstract class abstriction1 {

    abstract void show();
}

class car extends abstriction1{

    void show(){
        System.out.println("This is body of abstrict class");
    }
}

class vehical extends abstriction1{
    void show(){
        System.out.println("This is child class");
    }

    public static void main(String args[]){
        car ob = new car();
        ob.show();

        vehical ob1 = new vehical();
        ob1.show();
    }
}
