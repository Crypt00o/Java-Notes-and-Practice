package controlflow;
public class DecisionMake{
	  /**
	   * decision-making statements decide which statement to execute and when, Decision-making statements evaluate the Boolean expression and control the program flow depending upon the result of the condition provided
	   *
	   * There are two types of decision-making statements in Java : If statement and switch statement
	   *
	   *  
	   *  the "if" statement is used to evaluate a condition, The control of the program is diverted depending upon the specific condition, The condition of the If statement gives a Boolean value, either true or false
	   *
	   *
	   *  In Java, there are 4 types of if-statements :
	   *  
	   *
	   *  1- Simple if statement
	   *  2- if-else statement
	   *  3- if-else-if ladder
	   *  4- Nested if-statement
	   *
	   *
	   * 1- if(condition) {    
			statement 1; //executes when condition is true   
			}    
	   *
	   *
	   * 2- if(condition) {    
	  			statement 1; //executes when condition is true   
			}  
			else{  
			    statement 2; //executes when condition is false   
			}  

	    *
		*
		* 3- if(condition 1) {    
				  statement 1; //executes when condition 1 is true   
			}  
			 else if(condition 2) {  
				  statement 2; //executes when condition 2 is true   
			}  
			 else {  
				  statement 2; //executes when all the conditions are false   
			}


	  *
	  *
	  * 4- if(condition 1) {    
				  statement 1; //executes when condition 1 is true   
				  
				  if(condition 2) {  
						statement 2; //executes when condition 2 is true   
				  }  
				  else{  
						statement 2; //executes when condition 2 is false   
				  }  
			}  
	   * */

	  /**
	   * switch (expression){  
			  case value1:  
				  statement1;  
			  break;  
			 case valueN:  
				  statementN;  
			  break;  
			 default:  
				  default statement;  
			}  
	   *
	   * */
	  
	  public String reachPoint(String before, String after ){
			return before.concat(" => ").concat(after);
	  }

	  public void cryptoSimpleGameWithIfControl(){
			
			String journey = new String("Start");

			if( Math.random() < 0.5 ){
				  // flag A
				  journey=reachPoint(journey, "A");

				  if(Math.random() <0.4){
						// flag B
				  journey=reachPoint(journey, "B");

						if(Math.random() >0.3){
							  // flag C
							  journey=reachPoint(journey, "C");

						}
						else{
							  // flag E
							  journey=reachPoint(journey, "E");
						}
				  }
				  else{
						if(Math.random() <0.6){
							  // flag D
							  journey=reachPoint(journey, "D");

						}
						else{
							  // flag F
							  journey=reachPoint(journey, "F");
						}
				  }
			}
			else{
				  // flag G
				  journey=reachPoint(journey, "G");

				  if(Math.random()>0.5){
					 // flag H
						journey=reachPoint(journey, "H");

						if(Math.random() <0.6){
							  // flag I
							  journey=reachPoint(journey, "I");

						}
						else{
							  // flag J
							  journey=reachPoint(journey, "J");
						}

				  }
				  else if (Math.random()<0.7){
						// flag K
						journey=reachPoint(journey, "K");

						if(Math.random()>0.5){
							  // flag L
							  journey=reachPoint(journey, "L");

							  if(Math.random() <0.6){
							  // flag M
									journey=reachPoint(journey, "M");
							  }
						 	  else{
							  // flag N
							   journey=reachPoint(journey, "N");
							  }
						}
				  }
				  else{
						// flag O
						journey=reachPoint(journey, "O");

						if(Math.random()>0.5){
							  // flag P
							  journey=reachPoint(journey, "P");

							  if(Math.random() <0.6){
							  // flag Q
									journey=reachPoint(journey, "Q");
							  }
						 	  else{
							  // flag R
							   journey=reachPoint(journey, "R");
							  }
						}
	   

				  }
			}
			journey=reachPoint(journey,"End");
			System.out.println(journey);
	  }

	  
	  public void pickColorGame(){
			enum Colors{
				  red,
				  blue,
				  green,
				  yellow,
				  black,
				  orange,
				  white
			};		
			Colors color= Colors.values()[(int)(Math.random()*Colors.values().length)];
			switch (color){
				  case red:
						System.out.println("red");
				  break;
				  case yellow:
						System.out.println("yellow");
				  break;
				  case black:
						System.out.println("black");
				  break;
				  case green:
						System.out.println("green");
				  break;
				  case orange:
						System.out.println("orange");
				  break;
				  case white:
						System.out.println("white");
				  break;
				  case blue:
						System.out.println("blue");
				  break;
				  default:
						System.out.println("no color chosen");
				  break;

			}
	  }


	  
}
