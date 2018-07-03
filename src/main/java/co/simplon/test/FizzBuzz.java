package co.simplon.test;

public class FizzBuzz {
	
	public static String fizzBuzz(int min, int max) {
		String str = "";
		for (int i = min ; i <= max; i++) {
			str += numToString(i);
		}
		return str;
		}
	
	private  static String numToString(int num) {
		String result = "" + num;
		
		if (num%15 == 0) {
			result = "fizzbuzz";
		}else if (num%3 == 0) {
			result = "fizz";
		}else if (num%5 == 0) {
			result = "buzz";
		}
		    return result;
		
	}
}
