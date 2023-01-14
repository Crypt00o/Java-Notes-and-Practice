package controlflow;
class Loops{
	  /**
	   *
	   * 	   
	   *
	   * jump satements :
	   *
	   * 1- continue : doesn't break the loop, whereas, it skips the specific part of the loop and jumps to the next iteration of the loop immediately
	   *
	   * 2- break : used to break the current flow of the program and transfer the control to the next statement outside a loop or switch statement
	   *
	   * 
	   *
	   *
	   * The Java for loop is used to iterate a part of the program several times, If the number of iteration is fixed, it is recommended to use for loop
	   *

	   *
	   * 
	   * 1-For Loop :
	   *	
	   *
	   *	1- simple-for-loop
	   *
	   *		for( initialization; condition; increment/decrement ){
	   *			//to do
	   *		}
	   *
	   *	2- for-each-loop 
	   *		
	   *		for (datatype varname: Array/Collection ){
	   *			//to do
	   *		}
	   *
	   *
	   *	3- labled-for-loop
	   *		
	   *		labelname:    
				  for(initialization; condition; increment/decrement){    
						//to do 
				  }    
	   *
	   *
	   *
	   *
	   * 2-While Loop :
	   *	used to iterate a part of the program repeatedly until the specified Boolean condition is true, As soon as the Boolean condition becomes false, the loop automatically stops
	   *	
	   *	while(condition){
	   *		// to do 
	   *	}
	   *
	   *
	   * 3- Do While Loop : used to iterate a part of the program repeatedly, until the specified condition is true., If the number of iteration is not fixed and you must have to execute the loop at least once 
	   *
	   *	do{
	   *		// to do 
	   *	} while(condition);
	   *
	   * */

	  public void forLoopExample(){
			String[] crypt00oStack={"Java","Js","Ts","Rust","Python","C","Assembely(arm,0x86,0x86_64)","NodeJs","ExpressJs","MySQL","POSTGRESQL","Mariadb","Mongodb","Redis","Docker","Kubernates","RESTAPI","GraphQL","SOAP","GRPC"};
	  loopingUseLabledForLoopCompainedWithForEach:
			for(String i : crypt00oStack){
				  if (i=="POSTGRESQL")
						break loopingUseLabledForLoopCompainedWithForEach;
				  System.out.println(i);
			}
			for (int i =10;i< crypt00oStack.length; i++){
				  System.out.println(crypt00oStack[i]);
			}
	  }

}
