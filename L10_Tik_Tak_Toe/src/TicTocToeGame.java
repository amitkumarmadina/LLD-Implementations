package L10_Tik_Tak_Toe.src;

import java.util.*;


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
            try (Scanner inputScanner = new Scanner(System.in)) {
                String s = inputScanner.nextLine();
                String[] values = s.split(",");

                int inputRow = Integer.valueOf((values[0]));
                int inputCol = Integer.valueOf((values[1]));

                boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputCol, playerTurn.playingPiece);
                if(!pieceAddedSuccessfully){
                    System.out.println("Incorrect position choosen, try again");
                    players.addFirst(playerTurn);
                    continue;
                }
                players.addLast(playerTurn);

                boolean winner = isTherWinner(inputRow, inputCol, playerTurn.playingPiece.pieceType);
      
                if(winner){
                    return playerTurn.name;
                }
            } catch (NumberFormatException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return "tie";
    }

    public boolean isTherWinner(int row, int col, PieceType pieceType){
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for(int i = 0; i < gameBoard.size; i++){
            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType){
                rowMatch = false;
            }
        }

        for(int i = 0; i < gameBoard.size; i++){
            if(gameBoard.board[i][col] == null || gameBoard.board[i][col].pieceType != pieceType){
                colMatch = false;
            }
        }

        for(int i = 0, j = 0; i < gameBoard.size; i++, j++){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType){
                diagonalMatch = false;
            }
        }

        for(int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType){
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch; 
    }
}
