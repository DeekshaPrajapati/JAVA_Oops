package Final_Keyword;
/*
final used in method = jab hum ya chate he ki humara method override na ho to hum us method ko final bana dete he
 */
public class final_2 {

  final void m2(){
        System.out.println("this is m2 class");
    }

    void n2(){
        System.out.println("this is n2 class");
    }
}

class MM extends final_2{

//    void m2(){                          // here showing error because these method are final and inside of child class not used this method
//        System.out.println("this is mm class");
//    }
void n2(){
    System.out.println("this is  child class of n2 class");
}
   public static void main(String args[]){
       MM obj = new MM();
       obj.n2();
       obj.m2();
   }
}
