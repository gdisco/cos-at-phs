/*******************************************************************************
 * Ordered.java
 * Author: Garrett Disco
 * Compilation: javac Ordered.java
 * Execution: java Ordered n1 n2 n3
 * Last Update: September 3, 2012
 ******************************************************************************/
public class Ordered {
  public static void main(String[] args) {
    int n1 = Integer.parseInt(args[0]);
    int n2 = Integer.parseInt(args[1]);
    int n3 = Integer.parseInt(args[2]);
    boolean firstPair;
    boolean secondPair;
    
    firstPair = (n1 < n2);
    secondPair = (n2 < n3);
    
    System.out.println(firstPair && secondPair);
  }
}