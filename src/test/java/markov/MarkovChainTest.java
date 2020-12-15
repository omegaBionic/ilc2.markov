package markov;

import static org.junit.Assert.*;

import org.junit.Test;

import markov.MarkovChain;

public class MarkovChainTest {

    //@Test
    public void testLearnTrue() {
        // Cannot access to learn
//	    MarkovData data = new MarkovData();
//
//        String stringToLearn = "I am your father";
//	    data.read(stringToLearn);
//
//        String expected = stringToLearn;
//        String actual = data.getKeyWord(0) + " " + data.getKeyWord(1) + " " + data.getKeyWord(2)+ " " + data.getKeyWord(3);
//        assertEquals(expected, actual);
    }

    @Test
    public void testGenerateMarkovTrue() {
        String input = "a b";
        MarkovChain mark = new MarkovChain(1);

        mark.learn(input);

        String actual = mark.generateMarkov(1);
        String expected = "a";
        assertEquals(expected, actual);
    }
}
