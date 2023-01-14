package basics;
public class Operators {
/**
 * 
 *				Unary	
 * postfix						expr++ expr--
 * prefix						++expr --expr +expr -expr ~ !
 *				
 *				Arithmetic	
 * multiplicative				* / %
 * additive						+ -
 *				
 *				Shift		
 * shift						<< >> >>>
 *				
 *				Relational	
 * comparison					< > <= >= instanceof
 * equality						== !=
 * 
 *				Bitwise
 * bitwise AND					&
 * bitwise	exclusive OR		^
 * bitwise	inclusive OR		|
 *				
 *				Logical		
 * logical AND					&&
 * logical OR					||
 *				
 *				Ternary		
 * ternary						? :
 *				
 *				Assignment	
 * assignment					= += -= *= /= %= &= ^= |= <<= >>= >>>=
 *
 *
 * */
	  public void exampleOfInstanceOf(){
			
			Operators opr =new Operators();
			
			if( opr instanceof Operators ){
				  System.out.println("opr obj is instance of Operators ");
			}

	  }
	
}
