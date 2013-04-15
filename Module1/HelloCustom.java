/*******************************************************************************
 * HelloCustom.java
 * Author: Garrett Disco
 * Compilation: javac HelloCustom.java
 * Execution: java HelloCustom *name*
 * Last Update: September 2, 2012
 ******************************************************************************/

public class HelloCustom {
  public static void main(String[] args) {
    // Args[0] is the first command-line argument.
    String name = args[0];
    System.out.println("Go ahead, " + name + ", make my day.");
  }
}