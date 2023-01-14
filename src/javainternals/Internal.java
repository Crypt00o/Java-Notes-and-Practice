package javainternals;
public class Internal{

	  /**
	   * Steps Used To Compile Code by javac and Run Code by jre or implementation or phisical existance of jvm
	   *
	   * 1- prgram written as Program.java Class in java
	   *
	   * 2- jdk : (javac tool) which present java compiler Compile it to Bytecode and saved as  Program.class
	   *
	   * 3- ClassLoader is subsystem Compenent of jvm load Program.class it into memory and return bytecode
	   *
	   * 4- the ByteCode Verifier that check ByteCode for code fragments for illegal code that can violate access rights to objects
	   *
	   * 
	   *
	   * example for Bytecode disassembled  : 
	   *  
	   *  .class public LCryptoExample
	   *  
	   *  .super Ljava/lang/Object;
	   *
	   *	.method public Crypt00o()Ljava/lang/String
	   *	.local 2
	   *		const-string v1,"Crypt00o method called "
	   *		sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;
	   *		invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
	   *		return-object v1
	   *	.end method
	   *
	   * 
	   *
	   *
	   * 5 - Interpreter: Read bytecode stream then execute the instructions , By JIT which translate bytecode to native machine code to be Executed 
	   *
	   *
	  **/

	  /**
	   * JVM Architecture:
	   *
	   * 1- ClaassLoader is a subsystem Compenent of java which load bytecoded from .class files into memory inside jvm  , there are there types of java class loaders : 
	   *  
	   *  1-Bootstrap ClassLoader: This is the first classloader which is the super class of Extension classloader, It loads the rt.jar file which contains all class files of Java Standard Edition like java.lang package classes, java.net package classes, java.util package classes, java.io package classes, java.sql package classes etc
	   *  
	   *  2- Extension ClassLoader: This is the child classloader of Bootstrap and parent classloader of System classloader, It loades the jar files located inside $JAVA_HOME/jre/lib/ext directory
	   *
	   *  3- System/Application ClassLoader: This is the child classloader of Extension classloader, It loads the classfiles from classpath, By default, classpath is set to current directory, You can change the classpath using "-cp" or "-classpath" switch, It is also known as Application classloader
	   *
	   *  you will find me also use "-cp" to specify the path dir in build.sh  file on the root dir of this project cause i use neovim  , so in my case i  need to create ,  compile and manage and run all my java projects manually from zero , i develope a util called CryptoJavaProjectManager written in java will be released soon on my github account to manage java project for vimmers  .
	   *
	   *
	   *
	   * */


	   public void printClassLoader(){
			
			 Class InternalByteCode=Internal.class;
			 System.out.println(InternalByteCode.getClassLoader());

			// I Run it and it printout jdk.internal.loader.ClassLoaders$AppClassLoader@46fbb2c1 for me 
	  }
	  
	  public void printStringClassLoader(){
				  
	    //If we print the classloader name of String, it will print null because it is an  in-built class which is found in rt.jar, so it is loaded by Bootstrap classloader  

			Class StringClassLoader= String.class;
			System.out.println(StringClassLoader.getClassLoader());

	  }

	  /**
	   * 2- Class(Method) Area :  stores per-class structures such as the runtime constant pool, field and method data, the code for methods
	   *
	   *
	   * 3- Heap : It is the runtime data area in which objects are allocated
	   *
	   * 4- Stack : Java Stack stores frames, It holds local variables and partial results, and plays a part in method invocation and return , Each thread has a private JVM stack, created at the same time as thread  , A new frame is created each time a method is invoked,  A frame is destroyed when its method invocation completes
	   *
	   *
	   * 5- Program Counter Register : PC (program counter) register contains the address of the Java virtual machine instruction currently being executed
	   * 6-  Native Method Stack : It contains all the native methods used in the application ( i use this previously when i need to load my wirtten c malwares(backdoors) by java Useing jni Java native interface XD ) , we can use jni to interact and make FFI calls which is short for   Native Foregin function call   , so exactly as you understood we can use C,Rust,Go inside java and call exported native functions inside java code , so this function stored on special jvm Stack called Native Methods Stack
	   *
	   * 
	   * 7-  Execution Engine and It contains: 1- virtual processor  which allocate virtual registers like v0,p0 you see in the ByteCode i provide to you,
	   *										2- Interpreter: Read bytecode stream then execute the instructions
												3- Just-In-Time(JIT) compiler: It is used to improve the performance, JIT compiles parts of the byte code that have similar functionality at the same time, and hence reduces the amount of time needed for compilation and  translate from the instruction set of a Java virtual machine (JVM)  to the instruction set of a specific CPU
	   *
	   *
	   * 8 -  Java Native Interface : (JNI) is a framework which provides an interface to communicate with another application written in another language like C, C++, Assembly, Rust ,etc  Java uses JNI framework to send output to the Console or interact with OS libraries, in normal we use it to use call another function  written in native language like asm , c , rust , go, etc   , but i showed you before in (#6 , line : 84) how attackers use this in evil ways for fun XD
	   *
	   *
	   *  
	   *
	   *
	   * */

}
