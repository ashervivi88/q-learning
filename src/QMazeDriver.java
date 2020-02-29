/***
 * Ashley Kim 2/29/20
 * The purpose of this code is to create a series of mazes and solve them using Q learning
 * while outputting results to a file
 ***/

import java.io.IOException;

public class QMazeDriver {
    public static void main(String[]args) throws IOException {

        MazeGenerator mg = new MazeGenerator();
        QLearning ql = new QLearning();
        int numRuns = 5;
        mg.generate(numRuns); //generates mazes based on numRun

        for(int i = 0; i< numRuns; i++){ //adds Q Learning info to maze files
        ql.init("maze"+i+".txt");
            ql.calculateQ();
            ql.QandPolicyToFile(i);
        }





    }
}
