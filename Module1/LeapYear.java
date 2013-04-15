/*******************************************************************************
 * LeapYear.java
 * Author: Garrett Disco
 * Compilation: javac LeapYear.java
 * Execution: java LeapYear year
 * Last Update: September 3, 2012
 ******************************************************************************/
public class LeapYear {
  public static void main(String[] args) {
    int year = Integer.parseInt(args[0]);
    
    // true if year is divisible by 4
    boolean isLeapYear = (year % 4 == 0);
    
    // true if year is divisible by 4 AND not divisible by 100
    isLeapYear = isLeapYear && (year % 100 != 0);
    
    // true if year is divisible by 4 and NOT divisible by 100 OR if divisible by 4, 100, and 400.
    isLeapYear = isLeapYear || (!isLeapYear && (year % 400 == 0));
    
    System.out.println(isLeapYear);
  }
}