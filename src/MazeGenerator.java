import java.io.*;
import java.util.Random;

public class MazeGenerator {
    public void generate(int numRuns) throws IOException {

        Random rand = new Random();

        for(int i = 0; i< numRuns; i++){

        int[][] m = new int[3][3];
        int xRow = 0;
        int xCol = 0;
        int fRow = 0;
        int fCol = 0;

        while (xRow == fRow && xCol == fCol) {
            xRow = rand.nextInt(3);
            xCol = rand.nextInt(3);
            fRow = rand.nextInt(3);
            fCol = rand.nextInt(3);
        }

        m[xRow][xCol] = 1;
        m[fRow][fCol] = 2;
        String output = ""+m[0][0] + " " + m[0][1] + " " + m[0][2] + "\n" +
                        m[1][0] + " " + m[1][1] + " " + m[1][2] + "\n" +
                        m[2][0] + " " + m[2][1] + " " + m[2][2];

        writeFile(output, i);
    }
    }

        public void writeFile(String output, int fileNum)
  throws IOException {
            String fileName = "maze"+fileNum+".txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(output);
            writer.close();
        }



    }

