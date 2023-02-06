package InterFace;
/*
interface ke andar all methods abstrict type ke hi hoga, but normal method crete nhi kar sakte he .
upto java 8 version interface ke andar simple method bhi ho sakte he but unka type default hoga
upto java 9 version interface ke andar method public static type ke hote he.
 */

 interface AA {

    public void show();
 }
 class t2 implements AA{

    public void show(){
      System.out.println("This is interface");
     }
     public static void main(String args[]){
        t2 ob =new t2();
        ob.show();
     }
 }
