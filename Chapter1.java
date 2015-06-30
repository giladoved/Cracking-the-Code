import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Chapter1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	//Implement an algorithm to determine if a string has all unique characters.
	public boolean uniqueString(String str) {
		str = str.replaceAll("\\s+", "");
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		if (set.size() == str.length())
			return true;
		return false;
	}
	
	public boolean uniqueStringNoStructure(String str) {
		//char[] chars = str.toCharArray();
		//Arrays.sort(chars);
		str = str.toLowerCase();
		str = str.replaceAll("\\s+", "");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				if (j != i && str.charAt(i) == str.charAt(j))
					return false;
			}
		}
		
		return true;
	}

}
