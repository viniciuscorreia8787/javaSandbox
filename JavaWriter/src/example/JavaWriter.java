/**
 * 
 */
package example;

import java.io.FileWriter;  


/**
 * @author vinic
 *
 */
public class JavaWriter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		writeFile("this is my text");

	}



	  
	public static void writeFile(String textToBeWritten){    
	     try{    
	       FileWriter fw=new FileWriter("/home/vinic/Documents/Development/javaSandbox/JavaWriter/output/javaText.txt");    
	       fw.write("Welcome to javaTpoint.");    
	       fw.close();    
	      }catch(Exception e){System.out.println(e);}    
	      System.out.println("Success...");    
	 } 

}