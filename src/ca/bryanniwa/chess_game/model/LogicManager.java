package ca.bryanniwa.chess_game.model;

import java.util.List;

public class LogicManager {
    private final GameBoard gameBoard;

    public LogicManager() {
        gameBoard = new GameBoard();
    }

    public void start() {
//        List<Cell> res = gameBoard.getMoves(0, 2);
//        for (Cell p : res) {
//            System.out.println(p);
//        }

        List<Cell> res = gameBoard.getMoves(0, 0);
        for (Cell p : res) {
            System.out.println(p);
        }
    }

    public GameBoard getGameBoard() {
        return gameBoard;
    }
}
