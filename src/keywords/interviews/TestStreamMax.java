package keywords.interviews;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author Ravindu
 * 8/18/2022
 */
public class TestStreamMax {
    public static void main(String[] args) {
        int maxNum = Stream.of(1,3,21,3,4,12,23).max(Comparator.naturalOrder()).get();
        System.out.println(maxNum);
    }
}
