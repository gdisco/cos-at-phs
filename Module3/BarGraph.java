/*
Write a program that reads in an arbitrary number of command-line arguments as 
integers, and plots them in the order given in a bar graph. If you have time, 
try to plot both horizontal and vertical bar graphs (although horizontal bars 
will probably be easier).

A bar graph is a series of "bars" that shows a series of data points. A higher 
bar corresponds to a larger number. Negative numbers are drawn in the opposite 
direction of positive numbers.

Stages:
1. Works for positive numbers.
2. Works for any range of numbers, so long as max - min < 80.
3. Works for all numbers. (As the console window has limited width, you can't 
make you bars as big as you want, especially if the bars are horizontal.)

Play around with the formatting too! Add spacing between the bars, perhaps?

Related problem: Write a program that reads in a set of numbers and draws a 
histogram for the numbers. A histogram is a bar graph that shows how many 
times each number appears. 

For example, the data set 1 2 1 3 6 3 3 1 has the histogram

0 |
1 |xxx
2 |x
3 |xxx
4 |
5 |
6 |x


Usage:
> java BarGraph 1 2 3
|O
|OO
|OOO

> java BarGraph 1 0 -2 3
  |O
  |
OO|
  |OOO
  
  
Equivalent vertical bar graphs:
  O
 OO
OOO
---

   O
   O
O  O
----
  O
  O

*/

public class BarGraph {

	public static void main(String[] args) {
		int[] vals = new int[args.length];
		
		for (int i = 0; i < args.length; i++) {
			vals[i] = Integer.parseInt(args[i]);
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int n : vals) {
			if (n < min) {
				min = n;
			}
			if (n > max) {
				max = n;
			}
		}
		
		// do the displaying (this is a vertical bar graph)
		
		if (min < 0) {
			for (int j : vals) {
				if (j < 0) {
					for (int k = 0; k < j - min; k++) {
						System.out.print(" ");
					}
					for (int k = 0; k < -j; k++) {
						System.out.print("O");
					}
					System.out.println("|");
				} else {
					for (int k = 0; k < -min; k++) {
						System.out.print(" ");
					}
					System.out.print("|");
					for (int k = 0; k < j; k++) {
						System.out.print("O");
					}
					System.out.println();
				}
			}
		} else {
			for (int j : vals) {
				System.out.print("|");
				for (int k = 0; k < j; k++) {
					System.out.print("O");
				}
				System.out.println();
			}
		}
		
	}

}