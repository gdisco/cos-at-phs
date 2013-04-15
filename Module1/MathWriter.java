/*******************************************************************************
 * MathWriter.java
 * Author: Garrett Disco
 * Compilation: javac MathWriter.java
 * Execution: java MathWriter *int1* *int2*
 * Last Update: September 2, 2012
 ******************************************************************************/

public class MathWriter {
  public static void main(String[] args) {
    int int1 = Integer.parseInt(args[0]);
    int int2 = Integer.parseInt(args[1]);
    int sum = int1 + int2;
    System.out.println(int1 + " + " + int2 + " = " + sum);
  }
}