package Polymorphism_MethodOverRiding;
/*
 * Method overriding-- Same method in a different class, same argument (no. of argu., type of argument, sequence of argumenr)
 * And here compulsary use the inheritence by using "extends" keyword.
 */
public class Overriding1 {

	void show(int a) {


		System.out.println("First method");
	}
	
}
class override2 extends Overriding1 {
	
	void show(String s)
	{
		System.out.println("Second method");
	}

	public static void main(String[] args) {
		override2 obj = new override2();
		obj.show("");
		
		Overriding1 obj1 = new Overriding1();
		obj1.show(10);

	}

}
