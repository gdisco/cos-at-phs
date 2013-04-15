public class PrimeFactors {
	/*
	 * Prints out the entire prime factorization of the command-line argument N
	 */
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);

		boolean isFirst = true;

		for (int i = 2; i <= N; i++) {
			while (N % i == 0) {
				if (isFirst) {
					// don't print out the asterisk before the first character
					System.out.print(i);
					isFirst = false;
				}
				else
					System.out.print("*" + i);

				N /= i;
			}
		}
		System.out.println();
	}
}