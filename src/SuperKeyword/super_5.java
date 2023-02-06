package SuperKeyword;
/*
super () can be used to invoke immediate parent class constructor.
# 16 no. line per yasi super nhi lagya tab bhi compiler by default add kar dega.
 */
public class super_5 {

    super_5(){
        System.out.println("this is parent class constructor");
    }
}

class soap extends super_5{

    soap(){
        super();
        System.out.println("this is chil class constructor");
    }
  public static void main(String args[]){
        soap ob = new soap();
  }

}
