package Tests_Banking.Challenge;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParametrized {

    Utilities utilities;
    private String input;
    private String output;

    public UtilitiesTestParametrized(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setUp(){
        utilities = new Utilities();
    }

    @Test
    public void removePairsParametrized(){
        assertEquals(output, utilities.removePairs(output));
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

