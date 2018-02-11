import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class StringHandlerTest {

    private StringHandler stringHandler;

    @Before
    public void init() {
        stringHandler = new StringHandler();
    }

    @Test
    public void getSortedEvenNumbersArrayMustReturnCorrectArray() {
        String source = "16;1;3;4;5;7;8;9;6;9;10;11;12;14;15;15;11;11;2;11;17;18;19;20;18;21;18;22;23;24;25;26";
        int[] expected = {2, 4, 6, 8, 10, 12, 14, 16, 18, 18, 18, 20, 22, 24, 26};
        int[] result = stringHandler.getSortedEvenNumbersArray(source);
        assertTrue(Arrays.equals(expected, result));
    }
}
