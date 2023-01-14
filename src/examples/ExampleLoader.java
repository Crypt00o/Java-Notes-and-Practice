package examples;

import javainternals.Internal;

public class ExampleLoader{
	  public static void showClassLoaderExample(){
			System.out.println("[+] Printnig Class Loader of Internal Class");
			new Internal().printClassLoader();
			System.out.println("[+] Printing Class Loader of String ");
			new Internal().printStringClassLoader();
			System.out.println("[+] If You Don,t Know Why null is printed Check Classloader  Explaination on ./src/javainternals/Internal.java ");
	  }

	  public static void showExamples(){
			showClassLoaderExample();	
	  }

	   public ExampleLoader(){
			 showExamples();
	  }

}
