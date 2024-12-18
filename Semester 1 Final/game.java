import java.util.Random;

public class game {
    private die d = new die();
    private Random r = new Random();

    public game(){}


    // roll 2 dice numTimes times. Return the percentage of times that a 12 was rolled.
    public void runDiceGame(int numTimes) {
        d.rollTwoDice();
        int count = 0;
        for (int i = 0; i < numTimes; i++) {
            if (d.rollTwoDice() == 12) {
                count++;
            }
        }
        System.out.println("Games played: " + numTimes + " Games won: " + count + " Percentage won: " + count * 1.0 / numTimes);;
    }

    // return the average amount of money made after running the game numTimes times
    public void runStPetersGame(int numTimes){
        int sum = 0;
        for(int i = 0; i < numTimes; i++) {
            sum += d.stPeters();
        }
        System.out.println(sum * 1.0 / numTimes);
    }

  


    
}
