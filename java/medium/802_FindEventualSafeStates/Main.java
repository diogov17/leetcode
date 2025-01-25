import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FindEventualSafeStates finder = new FindEventualSafeStates();
        
        List<int[][]> tests = new ArrayList<>();
        int[][] test1 = {{1,2},{2,3},{5},{0},{5},{},{}};
        int[][] test2 = {{1,2,3,4},{1,2},{3,4},{0,4},{}};

        tests.add(test1);
        tests.add(test2);

        System.out.println("Safe nodes of the graph (ascending)");
        for (int i = 0; i < tests.size(); i++) {
            List<Integer> result = finder.eventualSafeNodes(tests.get(i));
            System.out.println("Test " + i + ": " + result.toString());
        }
    }

}