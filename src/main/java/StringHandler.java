import java.util.Arrays;

public class StringHandler {

    private static final String DELIMITER = ";";

    public int[] getSortedEvenNumbersArray(String input) {
        return Arrays.stream(input.split(DELIMITER))
                .mapToInt(Integer::valueOf)
                .filter(n -> n % 2 == 0)
                .sorted()
                .toArray();
    }

}