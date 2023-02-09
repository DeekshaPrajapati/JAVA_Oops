package Binding;

public class StaticBind_1 {

    int x= 10;
    static int y= 30;
    class Bind_2 extends StaticBind_1{

        int x=20;


        public  void main(String[] args) {
            StaticBind_1 sb = new Bind_2();
            System.out.println(sb.x);
            System.out.println(sb.y);
        }

    }
}

// yaha o/p me 10 and 30 print karega kuki yaha per humara reference variable StaticBind_1 type ka he jisme x= 10 and y= 30 he
// ya satic varia. ko bhi lelega.
// yaha per binding type of reference variable ke basis per ho rhi he,
