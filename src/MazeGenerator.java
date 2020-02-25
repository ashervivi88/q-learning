import java.util.Random;

public class MazeGenerator {
    public void generate(int numRuns){
        // create instance of Random class

        Random rand = new Random();
        int[][] m = new int[3][3];
        int xRow = 0;
        int xCol = 0;
        int fRow = 0;
        int fCol = 0;

        while(xRow == fRow && xCol == fCol) {
            xRow = rand.nextInt(3);
            xCol = rand.nextInt(3);
            fRow = rand.nextInt(3);
            fCol = rand.nextInt(3);
        }

        m[xRow][xCol] = 1;
        m[fRow][fCol] = 2;





    }

}
