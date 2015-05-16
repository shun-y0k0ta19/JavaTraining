package ex13_01;

public class CharacterCount {
	public int count(String str, char character) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == character) {
				count++;
			}
		}
		return count;
	}
}
