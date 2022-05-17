package snakesladders;
import java.util.Random;

public class Snakes {
    public static void main(String[] args)
    {

        int currPosition = 0;
        int ladder = 2;
        int snake = 3;


        Random rand = new Random();

        int diceValue = 1 + rand.nextInt(6);

        int option = 1 + rand.nextInt(3);

        switch(option)
        {
            case 1:
                System.out.println("player stay in same position");
                currPosition = 0 + currPosition;
                System.out.println("the position is " + currPosition);
                break;


            case 2:
                System.out.println("player moves ahead by number");

                if((diceValue + currPosition) > 100)
                {
                    currPosition = currPosition - diceValue;
                    System.out.println("the position is " + currPosition);
                }else {
                    currPosition = currPosition + diceValue;
                    System.out.println("the currentposition is  " + currPosition);
                }

                break;


            case 3:
                System.out.println("player moves behind by number");
                currPosition = currPosition - diceValue;
                if(currPosition<= 0) {
                    currPosition = 0;
                    System.out.println("the position is " + currPosition);
                }
                else
                    System.out.println("the position is " + currPosition);


        }


    }
}
