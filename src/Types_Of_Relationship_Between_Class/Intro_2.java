package Types_Of_Relationship_Between_Class;

public class Intro_2 {
    /*
    *****************************Type of Relation ************************************
    1) Inheritence:- It is inheriting the properies of parent class into child class .
    *               (OR)
    * Inheritance is the procedure by which one object acquires all the properites and behavoiors of a parent object.
     */

    // How to achive inheritance?
    // By using extends keyword

   //  */

    /*
    2) Association: Association is a relation between two separate classes which establishes through their Objects.
      Association can be one-to-one, one-to-many, many-to-one, many-to-many. In Object-Oriented programming,

      ***********************Two way to achive Assocation**********************************
      1) Direct

      public class Student{

         String name;
         int rollno;
       }
       To yaha per assocation ho raha he, Student HAS-A name and Student HAS-A rollno.

       2.) By using new keyword

       class Engine{

       }
       class Car{

       Engine e = new Engine();
       }

       yadi hum car class ke andar engine class ka object create kar de to yaha per humne new keyword ke throw
       classes ke bitch  assocatiob type ka relationship create kar diya
     */
}
