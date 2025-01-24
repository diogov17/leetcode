public class CountServersThatCommunicate {

    public int countServers(int[][] grid) {
        int height = grid.length;
        int width = grid[0].length;
        int onlineServers = 0;

        // Search each line
        for(int line = 0; line < height; line++) {
            int serversInCurrentLine = 0;
            int isolatedServerIndex = -1;

            for(int col = 0; col < width; col++) {
                if (grid[line][col] == 1) {
                    serversInCurrentLine++;
                    isolatedServerIndex = col;
                }
            }

            // If there are more than 1 server, they can already communicate in the same line
            if (serversInCurrentLine > 1) {
                onlineServers += serversInCurrentLine;
            }
            // If there is only 1 server, check if it can communicate in the same column
            else if (serversInCurrentLine == 1) {
                int serversInCurrentCol = 0;

                // Search isolated server column
                for(int line1 = 0; line1 < height; line1++) {
                    serversInCurrentCol += grid[line1][isolatedServerIndex];
                }

                if (serversInCurrentCol > 1) {
                    onlineServers++;
                }
            }
        }

        return onlineServers;
    }

}