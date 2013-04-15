/* lolololololololololololololololololololololololololololololololololololololol
 l Broken.java
 o Author: All teh lolcatz
 l Compilation: javac Broken.java
 o Execution: java Broken
 l Last Update: September 3, 2012
 lolololololololololololololololololololololololololololololololololololololol*/

public class Broken {
  public static void main(String[] args) {
    
    // Line 1
    int a = 10 / 3;
    System.out.println("Line 1: " + a);
    
    // Line 2
    boolean e = false;
    boolean f = true;
    System.out.println("Line 2: " + (e = f));
    
    // Line 3
    boolean b = (Math.sqrt(2) * Math.sqrt(2) == 2);
    System.out.println("Line 3: " + b);
    
    // Line 4
    int c = 10^6;
    System.out.println("Line 4: " + c);
    
    // Line 5
    int d = Math.abs(2147483647 + 1);
    System.out.println("Line 5: " + d);
    
  }
}