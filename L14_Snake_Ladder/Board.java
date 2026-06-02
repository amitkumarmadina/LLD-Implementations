package L14_Snake_Ladder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;
    Board(int boardSize, int numOfSnakes, int numOfLadders){
        initializeCells(boardSize);
        addSnakesLadders(cells, numOfSnakes, numOfLadders);
    }

    public void initializeCells(int boardSize){
        cells = new Cell[boardSize][boardSize];
        for(int i = 0; i < boardSize; i++){
            for(int j = 0; j < boardSize; j++){
                Cell cellObj = new Cell();
                cells[i][j] = cellObj;
            }
        }
    }

    public void addSnakesLadders(Cell[][] cells, int numOfSnakes, int numOfLadders){
        while(numOfSnakes > 0){
            int snaksHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int snaksTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            
            if(snaksHead <= snaksTail){
                continue;
            }

            Jump snakeObj = new Jump();
            snakeObj.start = snaksHead;
            snakeObj.end = snaksTail;

            Cell cell = getCell(snaksHead);
            cell.jump = snakeObj;
            
            numOfSnakes--;
        }
    
        while(numOfLadders > 0){
            int ladderStart = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            
            if(ladderEnd <= ladderStart){
                continue;
            }

            Jump ladderObj = new Jump();
            ladderObj.start = ladderStart;
            ladderObj.end = ladderEnd;

            Cell cell = getCell(ladderStart);
            cell.jump = ladderObj;

            numOfLadders--;
        }
    }

    Cell getCell(int playerPosition){
    int boardRow = playerPosition / cells.length;
    int boardCol = playerPosition % cells.length;
        return cells[boardRow][boardCol];
    }
}
