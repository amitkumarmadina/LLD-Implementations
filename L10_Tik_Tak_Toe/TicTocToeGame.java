package L10_Tik_Tak_Toe;

import java.util.*;

import L10_Tik_Tak_Toe.src.*;


public class TicTocToeGame {
    
    Deque<Player> players;
    Board gameBoard;

    TicTocToeGame(){
        initializeGame();
    }

    public void initializeGame(){

        players = new LinkedList<>();
        
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1", crossPiece);
        
        PlayingPieceO noghtsPiece = new PlayingPieceO();
        Player player2 = new Player("Player2", noghtsPiece);

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;
        while(noWinner){
            Player playerTurn = players.removeFirst();

            gameBoard.printBoard();
            List<Pair<Integer, Integer>> freeSpaces = gameBoard.getFreeCells();
            if(freeSpaces.isEmpty()){
                noWinner = false;
                continue;
            }

            System.out.println("Player:" + playerTurn.name + "Enter row, col: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");

            int inputRow = Integer.valueOf((values[0]));
            int inputCol = Integer.valueOf((values[1]));

            boolean piece
        }
    }
}
