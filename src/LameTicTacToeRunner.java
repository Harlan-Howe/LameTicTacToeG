public class LameTicTacToeRunner
{
    public static void main(String[] args)
    {
        System.out.println("Starting.");
        TicTacToeGame theGame = new TicTacToeGame();
        System.out.println("Made a game object.");
        theGame.playGame();
        System.out.println("End.");
    }
}
