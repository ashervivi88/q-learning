/***
 * Ashley Kim 2/29/20
 * The purpose of this code is to create a random 3 x 3 maze to be solved using Q learning, with one
 * embedded
 ***/

import java.io.*;
import java.util.Random;

public class MazeGenerator {
    /*
    Purpose: Generate random 3x3 maze
    Inputs: number of runs
    Outputs: nothing, but creates string that is used when writeFile method is called
    Conditions: Throws exception if can't write file
    */

    public void generate(int numRuns) throws IOException {

        Random rand = new Random();

        for(int i = 0; i< numRuns; i++){

        int[][] m = new int[3][3]; //creates 3x3 matrix
        int xRow = 0;
        int xCol = 0;
        int fRow = 0;
        int fCol = 0;

        while (xRow == fRow && xCol == fCol) { //selects two random positions that don't overlap
            xRow = rand.nextInt(3);
            xCol = rand.nextInt(3);
            fRow = rand.nextInt(3);
            fCol = rand.nextInt(3);
        }

        m[xRow][xCol] = 1; //Sets first position to reward
        m[fRow][fCol] = 2; //Sets second position to obstacle

        //Creates string based on matrix values and writes it to file
        String output = ""+m[0][0] + " " + m[0][1] + " " + m[0][2] + "\n" +
                           m[1][0] + " " + m[1][1] + " " + m[1][2] + "\n" +
                           m[2][0] + " " + m[2][1] + " " + m[2][2];

        writeFile(output, i);
    }
    }

        /*
        Purpose: writes file with maze named based on number of runs
        Inputs: string and number used to label file
        Outputs: nothing, but creates new file based on inputs
        Conditions: Throws exception if can't write file
        */
        public void writeFile(String output, int fileNum)
  throws IOException {
            String fileName = "maze"+fileNum+".txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(output);
            writer.close();
        }



    }

