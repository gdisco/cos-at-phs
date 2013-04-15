/*
The Fibonacci numbers are a sequence of numbers defined such that, if F(n) 
is the n-th Fibonacci number, then F(n) = F(n-1) + F(n-2). This sort of 
relation is called a "recursive relation" in math. We define F(0) = 0, and F(1) = 1.

Some small examples: F(2) = F(1) + F(0) = 1 + 0 = 1, F(3) = F(2) + F(1) = 1 + 1 = 2, 
F(4) = F(3) + F(2) = 2 + 1 = 3, ...

Normally, you would learn to calculate the Fibonacci numbers using recursive functions
(which we will cover later!). However, using recursion to calculate the 
Fibonacci numbers is generally pretty inefficient, so we will use a technique 
called "memoization" to calculate them instead.

The basic idea behind memoization is that we store the result of a computed 
value in memory, so that we don't have to recalculate it again later.

Write a program that takes one integer as an input, n, and prints out the value of 
the n-th Fibonacci number.

(Also, mention overflow of integers and longs?)
What happens when you call the program with the number 47? Can you fix this behaviour?
What happens when you call the program with 93? Can you fix it?

Random note: if you don't want to use loops, you can use Binet's formula to 
calculate factorials. However, then you have to deal with the value of sqrt(2).

Usage:
> java Fibonacci 1
1

> java Fibonacci 23
28657
 */

public class Fibonacci {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);


		if (n >= 93) { 
			System.out.println("Overflow"); 
			return; 
		}

		if (n < 0) {
			System.out.println(
					"Factorial is not defined for negative integers.");
			return;
		}
		
		if (n == 0) {
			System.out.println("0");
			return;
		}
		
		if (n == 1 || n == 2) {
			System.out.println("1");
			return;
		}

		long[] arr = new long[n + 1];
		arr[0] = 0L;
		arr[1] = 1L;

		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		System.out.println(arr[n]);
	}
}