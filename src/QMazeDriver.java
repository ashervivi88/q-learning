import java.io.IOException;

public class QMazeDriver {
    public static void main(String[]args) throws IOException {

        MazeGenerator mg = new MazeGenerator();
        QLearning ql = new QLearning();
        int numRuns = 5;
        mg.generate(numRuns);

        for(int i = 0; i< numRuns; i++){
        ql.init("maze"+i+".txt");
            ql.calculateQ();
            ql.QandPolicyToFile(i);
        }





    }
}
