//Program to Get a Character From the Given String

class character {

	public static char getCharFromString(String str, int index) {
		return str.charAt(index);
	}

	public static void main(String[] args) {
		String str = "ABCDEFGH";

		int index = 5;
		char ch = getCharFromString(str, index);

		System.out.println("\nCharacter from " + str
				+ " at index " + index
				+ " is " + ch);
	}
}
