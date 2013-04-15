public class CoinToss {

	/*
	 * Randomly tosses a fair coin. Returns 1 if the coin is heads, -1 for tails.
	 */
	public static int tossFairCoin() {
		double r = Math.random();
		if (r < 0.5)
			return 1;
		else
			return -1;
	}

	/*
	 * Randomly tosses a coin in game A. Returns 1 if the coin is heads, -1 for tails.
	 * P(heads) = 0.495
	 * P(tails) = 0.505
	 */
	public static int gameA() {
		double r = Math.random();
		if (r < 0.495)
			return 1;
		else
			return -1;
	}

	/*
	 * Randomly tosses a coin in game B based on the current balance. Returns 1 if the coin is heads, -1 if tails.
	 * Coin B1- current balance is a multiple of 3
	 * 	P(Heads) = 0.095
     *	P(Tails) = 0.905
	 *
	 * Coin B2- current balance is not a multiple of 3
	 *	P(Heads) = 0.745
     * 	P(Tails) = 0.255
     */
	public static int gameB(int balance) {
		if (balance % 3 == 0) {
			double r = Math.random();
			if (r < 0.095)
				return 1;
			else
				return -1;
		}
		else {
			double r = Math.random();
			if (r < 0.745)
				return 1;
			else
				return -1;
		}
	}

	/*
	 * Read number of games N and number of experiments T as command-line parameters.
	 * Prints the average balance for each game.
	 */
	public static void main(String[] args) {
		// Read in command-line params
		int N = Integer.parseInt(args[0]);
		int T = Integer.parseInt(args[1]);

		// Define variables to represent the balance in each game
		int balFair, balA, balB, balABB;

		// Define variables to represent the average balance over a run of games
		double avgFair = 0, avgA = 0, avgB = 0, avgABB = 0;

		// Run T experiments
		for (int t = 0; t < T; t++) {
			// Reset the balance for the current experiment
			balFair = 0;
			balA = 0;
			balB = 0;
			balABB = 0;

			// Play N rounds of each type of game and add the result to the current balance
			for (int n = 0; n < N; n++) {
				balFair += tossFairCoin();
				balA += gameA();
				balB += gameB(b);
				balABB += gameA();
				balABB += gameB(balABB);
				balABB += gameB(balABB);
			}

			// Update the average balances with the results from this experiment
			avgbalance += balFair;
			avgA += balA;
			avgB += balB;
			avgABB += balABB;
		}

		// Divide each balance by T to obtain the average
		avgbalance /= T;
		avgA /= T;
		avgB /= T;
		avgABB /= T;

		// Print the results
		System.out.println("Fair coin: " + avgbalance);
		System.out.println("Game A: " + avgA);
		System.out.println("Game B: " + avgB);
		System.out.println("Game ABB: " + avgABB);
	}
}