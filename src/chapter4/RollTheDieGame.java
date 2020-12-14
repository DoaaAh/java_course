package chapter4;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String[] arg){
        Random random = new Random();
        int lastSpace = 20;
        int numberOfRolls = 5;
        int currentSpace = 0;
        for(int i = 0; i<numberOfRolls; i++)
        {
            int die = random.nextInt(6) + 1;
            currentSpace += die;
            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));

            if(currentSpace == lastSpace)
            {
                System.out.println("Congrates!. You are now on the last space");
                break;
            }
            else if ( currentSpace > lastSpace)
            {
                System.out.println("Sorry! You lost, and now you passed the " +lastSpace);
                break;
            }
            else if ( i==numberOfRolls && currentSpace < lastSpace)
            {
                System.out.println("Sorry! You lost, you couldn't reach the last space");
            }
            else {
                int spacesToGo = lastSpace - currentSpace;
                System.out.println("You've rolled a You are now on space " + currentSpace + " and have " + spacesToGo + " more to go.");
            }
        }


    }
}
