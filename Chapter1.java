import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Chapter1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	
	/**
	 * Determines if every character in a string is all unique. All spaces are ignored and is case sensitive.
	 * Uses a Set as part of this algorithm
	 * @param inputString the string that is going to be checked for unique characters
	 * @return true if every single character in the input string is unique and false otherwise
	 */
	public boolean uniqueString(String inputString) {
		inputString = inputString.replaceAll("\\s+", ""); //remove spaces
		Set<Character> uniqueCharacters = new HashSet<Character>();
		for (int i = 0; i < inputString.length(); i++) {
			uniqueCharacters.add(inputString.charAt(i));
		}
		if (uniqueCharacters.size() == inputString.length())
			return true;
		
		return false;
	}
	
	
	/**
	 * Determines if every character in a string is a unique character. All spaces are ignored and is case sensitive.
	 * Does not use any data structures in this algorithm
	 * @param inputString the string that is going to be checked for unique characters
	 * @return true if every single character in the input string is unique and false otherwise
	 */
	public boolean uniqueStringNoStructure(String inputString) {
		inputString = inputString.replaceAll("\\s+", ""); //remove spaces
		for (int i = 0; i < inputString.length(); i++) {
			for (int j = i; j < inputString.length(); j++) {
				if (j != i && inputString.charAt(i) == inputString.charAt(j))
					return false;
			}
		}
		
		return true;
	}

	//Write code to reverse a C-Style String
	public String reverseCstyle(String str) {
		String result = str;
		
		
		
		return result;
	}
	
}
