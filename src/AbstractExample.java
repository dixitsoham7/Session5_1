/*Program demonstrates implementation of abstract class and abstract method
 * class when defined as abstract we cannot create object of that class
 * abstract class can have abstract methods or concrete methods or both together as shown below
 * abstract classes help in generalization
 * methods declared as abstract in abstract class are to be defined in child class
 * which extends this abstract class. This process is shown below*/

import java.util.Scanner;

abstract class AbstractExample {        //abstract class . object of this class cannot be created
	
	public void add(int a, int b)   //concrete method of abstract class
	{
		int sum;         //sum variable of integer type
		sum=a+b;         //addition process
		System.out.println("\nThis is Concrete Method of abstract class");
		System.out.println("Sum = "+sum);    //displaying sum
	}
	
	public abstract int multiply(int a, int b); //abstract method of abstract class which cannot be defined here. 
		//abstract method ends with semicolon and has abstract as access specifier
} //end of abstract class

class ChildClass extends AbstractExample         //child class which extends abstract class
//if this child class which extends abstract class doesn't define abstract methods of base class then this child class also becomes abstract class 
{
	public int multiply(int a, int b)        //defining abstract method in child class
	{
		int multiply;      //multiply variable of integer type
		multiply = a*b;    //multiplication process
		System.out.println("\nThis is Abstract Method of abstract class");
		System.out.println("Multiplication = "+multiply);  //displaying multiplication
		return 0;
	}
	
	public static void main(String[] args) //main method
	{
		//AbstractExample obj = new AbstractExample();      //we cannot create object of abstract class
		ChildClass object = new ChildClass(); //creating object of child class
		Scanner sc = new Scanner(System.in); //creating object for scanner
		System.out.print("Enter two numbers : ");  //displaying to take input
		int first = sc.nextInt();  //taking input
		int second = sc.nextInt(); //taking input
		
		//add is concrete method while multiply is Abstract method
		object.add(first,second);  //calling add method 
		object.multiply(first, second); //calling multiply method 
	}//end of main

}//end of child class

//abstract methods are declared in abstract class and defined in child class
//if class is abstract then we cannot create object of that class
//abstract classes help us in generalization