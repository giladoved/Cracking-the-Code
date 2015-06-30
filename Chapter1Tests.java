import static org.junit.Assert.*;

import org.junit.Test;


public class Chapter1Tests {

	@Test
	public void test() {
		Chapter1 tester = new Chapter1();
		assertTrue(tester.uniqueString("qwertyuiopasdfghjklzxcvbnm"));
		assertFalse(tester.uniqueString("adjshbsakdjvhdskvja"));
		assertFalse(tester.uniqueString("a a djcbk"));
		assertFalse(tester.uniqueString("ksadak jda sdlajdn"));
		assertTrue(tester.uniqueString("a uhrm qwf"));
		assertFalse(tester.uniqueString("Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of de Finibus Bonorum et Malorum (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, Lorem ipsum dolor sit amet.., comes from a line in section 1.10.32"));
		
		assertTrue(tester.uniqueStringNoStructure("qwertyuiopasdfghjklzxcvbnm"));
		assertFalse(tester.uniqueStringNoStructure("adjshbsakdjvhdskvja"));
		assertFalse(tester.uniqueStringNoStructure("a a djcbk"));
		assertFalse(tester.uniqueStringNoStructure("ksadak jda sdlajdn"));
		assertTrue(tester.uniqueStringNoStructure("a uhrm qwf"));
		assertFalse(tester.uniqueStringNoStructure("Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of de Finibus Bonorum et Malorum (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, Lorem ipsum dolor sit amet.., comes from a line in section 1.10.32"));
	}

}
