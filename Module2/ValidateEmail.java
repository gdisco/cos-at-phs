public class ValidateEmail {

	/*
	 * returns true if the String s contains exactly one of the character c
	 */
	public static boolean containsExactlyOne(String s, char c) {
		boolean found = false;

		// iterate through each character in the string
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				if (found == true) // already found one, this is the second
					return false;
				else
					found = true;
			}
		}
		return found;
	}

	/*
	 * returns true if the String s contains the character 'after' after the character 'before'
	 */
	public static boolean containsAfter(String s, char before, char after) {
		boolean foundBefore = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == after && foundBefore == true)
				return true;

			if (s.charAt(i) == before)
				foundBefore = true;
		}
		return false;
	}

	/*
	 * returns true if neither the first character, the last character,
	 * nor the character immediately before an '@' in String s is a dot
	 */
	public static boolean dotLocationsValid(String s) {
		// check first and last character
		if (s.charAt(0) == '.' || s.charAt(s.length() - 1) == '.')
			return false;

		// iterate through s and look for a ".@"
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == '@' && s.charAt(i-1) == '.')
				return false;
		}

		return true;
	}

	/*
	 * returns true if the characters after the '@' in String s
	 * are only letters, digits, hyphens, and dots
	 */
	public static boolean validDomainPart(String s) {
		boolean foundAt = false;
		for (int i = 0; i < s.length(); i++) {
			if (foundAt) {
				char c = s.charAt(i);
				boolean isLetter = c >= 'A' && c <= 'z';
				boolean isDigit = c >= '0' && c <= '9';

				if (!isLetter && !isDigit && c != '-' && c != '.')
					return false;
			}

			if (s.charAt(i) == '@')
				foundAt = true;
		}
		return true;
	}

	/*
	 * read email address as a command-line argument;
	 * print whether argument is a valid email
	 */
	public static void main(String[] args) {
		String email = args[0];

		if (containsExactlyOne(email, '@') && containsAfter(email, '@', '.')
			&& dotLocationsValid(email) && validDomainPart(email))
			System.out.println(email + " is a valid email address");
		else
			System.out.println(email + " is not a valid email address");
	}
}