package basics;
public class Variables{
	  /**
	   * Variable:
	   *  1- container which holds the value while the Java program is executed
	   *  2-  it is assigned with a  spefic data type
	   *  3-  it is a name of memory location  which store spefic 
	   *
	   *  Types of Variables: 
	   *		1- local variables : variable declared inside the body of the method is called local variable and can be accessed only by the method
	   *
	   *		2- static variables : variable that is declared as static is called a static variable, It cannot be local, You can create a single copy of the static variable and share it among all the instances of the class, Memory allocation for static variables happens only once when the class is loaded in the memory 
	   *
	   *		3- instance variables : variable declared inside the class but outside the body of the method, is called an instance variable, It is not declared as static
	   *		
	   *
	   *
	   * */

	  static int staticVariable =0 ; // static var 
	  int instanceVariable=0; // instance var 
	  
	  public void someMethod(){
			int localVariable =0; // local var 		
	  }



}
