package co.simplon.test;

public class CamelCase {

	public static String camelCase(String str) {
		String word = str;
		String newWord = "";

		if ((str != "") && (str != null)) {
			char[] separators = { ' ', '-', '_' };
			int nbWords = 1;
			for (int j = 0; j < word.length() - 1; j++) {
				if (word.charAt(j) != separators[0] && word.charAt(j) != separators[1]
						&& word.charAt(j) != separators[2]) {
					nbWords++;
				}
				if (nbWords == 1) {
					char startWord = str.toUpperCase().charAt(0);
					int wordLength = str.length() - 1;
					String endWord = "";
					for (int i = 1; i < wordLength + 1; i++) {
						endWord = endWord + str.toLowerCase().charAt(i);
					}
					word = startWord + endWord;
				}else if (nbWords > 1) {
					//for (int n : nbWords)
						
				// ##############################################
				// A travailler avec les expressions regulieres
					
					
				}

			}

		}
		return word;
	}
}
