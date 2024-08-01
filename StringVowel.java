package Keerthi;

public class StringVowel {

	public static void main(String[] args) {

		String word = "keerthi";

		int vowelCount = countVowels(word);

		System.out.println("Number of vowels in \"" + word + "\": "+ vowelCount );
		
	}

	public static int countVowels(String str) {
		int count = 0;
       str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}

		return count;

	}
}
