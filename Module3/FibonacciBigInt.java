/**
 * Version of Fibonacci calculator implemented using BigIntegers to avoid 
 * overflow. Probably beyond the scope of this module.
 */

import java.math.BigInteger;
 
public class FibonacciBigInt {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);

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

		BigInteger[] arr = new BigInteger[n + 1];
		arr[0] = BigInteger.ZERO;
		arr[1] = BigInteger.ONE;

		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1].add(arr[i - 2]);
		}

		System.out.println(arr[n]);
	}
}