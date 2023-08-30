import java.util.Scanner;

public class TicTacToeGame
{
    // create class variables here....
    private String square1, square2, square3, square4, square5;
    private String square6, square7, square8, square9;
    private String whoseTurn;
    private boolean keepPlaying;
    private Scanner keyReader;
    /**
     * Constructor
     */
    public TicTacToeGame()
    {
        square1 = "1";
        square2 = "2";
        square3 = "3";
        square4 = "4";
        square5 = "5";
        square6 = "6";
        square7 = "7";
        square8 = "8";
        square9 = "9";
        whoseTurn = "X";
        keepPlaying = true;
        keyReader = new Scanner(System.in);
    }

    /**
     * handles the main game loop.
     */
    public void playGame()
    {
        // print the board
        System.out.println(square1+"|"+square2+"|"+square3);
        System.out.println("-+-+-");
        System.out.println(square4+"|"+square5+"|"+square6);
        System.out.println("-+-+-");
        System.out.println(square7+"|"+square8+"|"+square9);
        // loop while we should keep playing
        while (keepPlaying )
        {   // say whose turn it is
            System.out.println("Hey, player "+whoseTurn+", it's your turn!");

            int whichSquare = -1;
            // keep asking until we get a good answer...
            while (whichSquare < 1 || whichSquare > 9)
            {
                System.out.print("What square do you want? ");
                // ask what square the person wants.
                whichSquare = keyReader.nextInt();
                // check whether it is legal
            }
            System.out.println("You chose square "+whichSquare);
            // make the change

            // print the board again
            System.out.println(square1 + "|" + square2 + "|" + square3);
            System.out.println("-+-+-");
            System.out.println(square4 + "|" + square5 + "|" + square6);
            System.out.println("-+-+-");
            System.out.println(square7 + "|" + square8 + "|" + square9);
            // check if the player just won.

            // check if it's a tie...

            // switch whose turn it is.
            if (whoseTurn.equals("X"))
            {
                whoseTurn = "O";
            }
            else
            {
                whoseTurn = "X";
            }
        }
    }

}
