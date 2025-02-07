package _1267_count_servers_that_communicate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SolutionTest {

    private final Solution solution = new Solution();

    private static Object[] provideTestArguments() {
        return new Object[]{
            new Object[] {
                new int[][] {
                    {1,0},
                    {0,1}
                }, 0
            },
            new Object[] {
                new int[][] {
                    {1,0},
                    {1,1}
                }, 3
            },
            new Object[] {
                new int[][] {
                    {1,1,0,0},
                    {0,0,1,0},
                    {0,0,1,0},
                    {0,0,0,1}
                }, 4
            }
        };
    }

    @ParameterizedTest(name = "Test {index}: input = {0}, expected output = {1}")
    @MethodSource("provideTestArguments")
    public void testSolution(int[][] grid, int expectedOutput) {
        int result = solution.countServers(grid);
        assertEquals(expectedOutput, result);
    }
}