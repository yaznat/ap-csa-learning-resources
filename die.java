import java.util.Random;

public class die {
    private Random r = new Random();


    // roll two dice and return their sum
    public int rollTwoDice(){
        return r.nextInt(6) + r.nextInt(6) + 2;
    }

    // flip a coin: return 0 or 1
    public int flip(){
        return r.nextInt(2);
    }

    /*
    Here's the game: you start with one dollar. 
    Every time you roll a heads, you double the money.
    If you roll a tails the game stops.
    Return how much money you make.
    */ 
    public int stPeters(){
        int pot = 1;
        while (flip() == 1) {
            pot = pot * 2;
        }
        return pot;

    }

    

}
