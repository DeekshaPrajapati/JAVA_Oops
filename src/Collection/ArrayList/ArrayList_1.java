package Collection.ArrayList;

// ArrayList is an implemented class of list interface which is present in java.util package.
// ArrayList is created on the basis of growalle or resizeble (mtlb array ki size ko kam ya jyda kar sakte he) array.
// Arraylist only 10 element store karwa sakta he.

//**************************** Properties of ArrayList *******************************************
//1.) Arraylist are index based data structure.
// 2.) Arraylist can store different data-type or hetrogenious data-type.
//3.) Arraylist can store duplicate values.
// 4.) Arraylist can store any number of  null  values.
//5.) Arraylist follows a insertation order.
//6.) Arraylist does not follows a sorted order.
//7.) Arraylist are non-synchronized.

// Syntax of ArrayList= class ArrayList implements List
//                     {
  //                      //Constructors, methods
    //                   }


//****************************** Types of Constructor in Array ***********************************

import java.util.ArrayList;

public class ArrayList_1 {

    // Empty Constructor,, ArrayList()

    public static void main(String[] args) {

        ArrayList al = new ArrayList(); // yaha per yak blank array create ho jyga, jiska size 10 hoga.

        al.add(10);
        al.add(20);

        System.out.println(al);

    }
}
