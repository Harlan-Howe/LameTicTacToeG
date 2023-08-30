public class TicTacToeGame
{
    // create class variables here....
    private String square1, square2, square3, square4, square5;
    private String square6, square7, square8, square9;
    private String whoseTurn;
    private boolean keepPlaying;

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

            // ask what square the person wants.

            // make the change

            // print the board again
            System.out.println(square1 + "|" + square2 + "|" + square3);
            System.out.println("-+-+-");
            System.out.println(square4 + "|" + square5 + "|" + square6);
            System.out.println("-+-+-");
            System.out.println(square7 + "|" + square8 + "|" + square9);
            // check if the player just won.

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
