package snakesladders;

public class Snakes {
    public static void main(String[] args)
    {

        Random dice = new Random();

        int number = 1 + dice.nextInt(6);

        System.out.println("The dice number is "+ number );

    }
}
