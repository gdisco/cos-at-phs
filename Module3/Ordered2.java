/*
Improve the Ordered program you wrote to take in an arbitrarily long list of 
integers, and to print out true or false depending on whether <b>all</b> the 
integers are in ascending order.

Usage:
> java Ordered2 2 6 
true

> java Ordered2 654 789 65434 385861 654849 758794 1569889 7884898 8484965 -7
false

> java Ordered2 1 
At least two numbers must be given.
*/

public class Ordered2 {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("At least two numbers must be given.");
			return;
		}
		
		for (int i = 1; i < args.length; i++) {
			int i1 = Integer.parseInt(args[i-1]);
			int i2 = Integer.parseInt(args[i]);
			
			if (i1 >= i2) {
				System.out.println(false);
				return;
			}
		}
		
		System.out.println(true);
	}
}