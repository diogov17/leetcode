import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the grid dimensions
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        
        // Read the grid
        int[][] grid = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        CountServersThatCommunicate counter = new CountServersThatCommunicate();
        int result = counter.countServers(grid);

        System.out.println("Number of servers that communicate with any other server: " + result);
    }

}