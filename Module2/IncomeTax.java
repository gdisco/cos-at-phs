public class IncomeTax {
	/*
	 * Calculates the minimum amount of income tax paid by a Monopoly player
	 */
	public static void main(String[] args) {
		int money = Integer.parseInt(args[0]);

		int percent = money / 10;
		int flatRate = 200;

		if (percent < flatRate)
			System.out.println(percent);
		else
			System.out.println(flatRate);
	}
}