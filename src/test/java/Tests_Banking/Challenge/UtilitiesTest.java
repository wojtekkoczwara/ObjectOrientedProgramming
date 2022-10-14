package Tests_Banking.Challenge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class UtilitiesTest {

    Utilities utilities;

    private String input;
    private String output;

    public UtilitiesTest(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setUp(){
        utilities = new Utilities();
    }

    @Test
    public void everyNthChar() {
        char[] charArray = {'h', 'e', 'l', 'l', 'o'};
        int n = 2;
        char[] charExpected = {'e', 'l'};
        Assert.assertArrayEquals(charExpected, utilities.everyNthChar(charArray, n));
        Assert.assertArrayEquals(charArray, utilities.everyNthChar(charArray, 6));
    }

    @Test
    public void removePairs() {
        String string1 = "AABCDDEFF";

        assertEquals("ABCDEF", utilities.removePairs(string1));

        String string2 = "ABCCABDEEF";
        assertEquals("ABCABDEF", utilities.removePairs(string2));

        String oneChar = "a";
        assertEquals("a", utilities.removePairs(oneChar));

        String sameChars = "AAAAAAAA";
        assertEquals("A", utilities.removePairs(sameChars));

        String upperAndLowerMixed = "AAAAAaaaaa";
        assertEquals("Aa", utilities.removePairs(upperAndLowerMixed));

        String nullString = null;
        assertEquals(null, utilities.removePairs(nullString));

        String empty = "";
        assertEquals("", utilities.removePairs(""));
    }

    @Test public void removePairsParametrized(){
        assertEquals(output, utilities.removePairs(input));
    }

    @Test
    public void converter() {
        assertEquals(300, utilities.converter(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void converter_fail() {
        assertEquals(300, utilities.converter(10, 0));
    }

    @Test
    public void nullIfOddLength() {
        String stringOdd = "Yes or no";
        String stringEven = "Banana";
        assertEquals(null, utilities.nullIfOddLength(stringOdd));
        assertEquals("Banana", utilities.nullIfOddLength(stringEven));

    }

    @Parameterized.Parameters
    public static Collection<Object> removePairsParameters(){
        return Arrays.asList(new Object[][]{
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"A", "A"}
        });
    }
}