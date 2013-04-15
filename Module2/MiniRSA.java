public class MiniRSA {
	/*
	 * Prints out the factors of a command-line argument N.
	 * N has exactly two prime factors.
	 */
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);

		for (int i = 2; i < N; i++) {
			if (N % i == 0)
				System.out.println(i);
		}
	}
}