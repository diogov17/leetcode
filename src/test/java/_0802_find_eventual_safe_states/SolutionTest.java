package _0802_find_eventual_safe_states;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    private final Solution solution = new Solution();

    private static Object[] provideTestArguments() {
        return new Object[]{
            new Object[] {
                new int[][] {{1,2},{2,3},{5},{0},{5},{},{}},
                Arrays.asList(2,4,5,6)
            },
            new Object[] {
                new int[][] {{1,2,3,4},{1,2},{3,4},{0,4},{}},
                Arrays.asList(4)
            }
        };
    }

    @ParameterizedTest(name = "Test {index}: input = {0}, expected output = {1}")
    @MethodSource("provideTestArguments")
    public void testSolution(int[][] graph, List<Integer> expectedOutput) {
        List<Integer> result = solution.eventualSafeNodes(graph);
        assertEquals(expectedOutput, result);
    }
}