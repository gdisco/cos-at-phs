/*******************************************************************************
 * DiceRoller.java
 * Author: Garrett Disco
 * Compilation: javac DiceRoller.java
 * Execution: java DiceRoller N
 * Last Update: September 2, 2012
 ******************************************************************************/
public class DiceRoller {
  public static void main(String[] args) {
    
    int N = Integer.parseInt(args[0]);
    
    // Get a random double in the range [0, N) and cast it to an integer. When
    // casting from double to int, Java always rounds down, so the range of 
    // possible values for roll is 0 to N - 1.
    int roll = (int)(Math.random() * N);
    
    // Correct for the fact that an N-sided die has possible values 1 to N, 
    // not 0 to N-1
    roll = roll + 1;
    
    System.out.println(roll);
  }
}