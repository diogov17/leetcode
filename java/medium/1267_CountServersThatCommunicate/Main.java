import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CountServersThatCommunicate counter = new CountServersThatCommunicate();
        
        List<int[][]> tests = new ArrayList<>();
        int[][] test1 = {{1,0},{0,1}};
        int[][] test2 = {{1,0},{1,1}};
        int[][] test3 = {{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}};

        tests.add(test1);
        tests.add(test2);
        tests.add(test3);

        System.out.println("Number of servers that communicate with any other server");
        for (int i = 0; i < tests.size(); i++) {
            int result = counter.countServers(tests.get(i));
            System.out.println("Test " + i + ": " + result);
        }
    }

}