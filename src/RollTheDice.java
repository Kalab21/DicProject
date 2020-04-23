import java.util.Random;


public class RollTheDice
{
    private int myRollCount;
    private int mySides;
    private Random myRandGen;

    public RollTheDice()
    {
        this(6);
    }

    public RollTheDice(int sides)
    {
        myRollCount = 1;
        mySides = sides;
        myRandGen = new Random();
    }

    public int roll()
    {
        myRollCount++;
        return myRandGen.nextInt(mySides) + 1;
    }

    public int numSides()
    {
        return mySides;
    }


    public int numRolls()
    {
        return myRollCount;
    }

    public String toString()
    {
        return "# sides: " + numSides() + " # rolls: " + numRolls();
    }
    int die1;   // The number on the first die.
    int die2;   // The number on the second die.
    int roll;   // The total roll (sum of the two dice).

    public static void main(String[] args)
    {
        RollTheDice die = new RollTheDice();

        for(int k = 0; k < 100; k++)
        {
            int roll = die.roll();
            System.out.println("roll " + die.numRolls() + ": " + roll);
        }
    }
}