package markov;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarkovDataTest {
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	public void testRead() {
		MarkovData data = new MarkovData();

		String stringToLearn = "I am your father";
		data.read(stringToLearn);

		String expected = stringToLearn;
		String actual = data.getKeyWord(0) + " " + data.getKeyWord(1) + " " + data.getKeyWord(2)+ " " + data.getKeyWord(3);
		assertEquals(expected, actual);
	}

	public void testRenforceWord() {
	}
}
