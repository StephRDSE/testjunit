package co.simplon.test;

import java.util.ArrayList;
import java.util.List;

public class CountSmileys {

	public static int countSmileys(List<String> arr) {
		int result = 0;
		List<String> smileys = new ArrayList<String>();
		smileys.add(":)");
		smileys.add(":D");
		smileys.add(";)");
		smileys.add(";D");
		smileys.add(":~)");
		smileys.add(":~D");
		smileys.add(":-)");
		smileys.add(":-D");
		smileys.add(";~)");
		smileys.add(";~D");
		smileys.add(";-)");
		smileys.add(";-D");

		if (arr != null) {

			for (String e : arr) {
				if (smileys.contains(e)) {
					result++;
				}
			}

		}
		return result;

	}
}
