package ca.bryanniwa.chess_game.model.game_pieces;

import ca.bryanniwa.chess_game.model.Cell;
import ca.bryanniwa.chess_game.model.GameBoard;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends GamePiece{
    public Bishop(PlayerEnum playerEnum) {
        super(playerEnum);
    }

    @Override
    public List<Cell> getMoves(int xPos, int yPos) {
        List<Cell> moves = new ArrayList<>();

        // down-right
        int i = xPos;
        int j = yPos;
        while (++i < GameBoard.SIZE && ++j < GameBoard.SIZE) {
            moves.add(new Cell(i, j));
        }

        // down-left
        i = xPos;
        j = yPos;
        while (++i < GameBoard.SIZE && --j >= 0) {
            moves.add(new Cell(i, j));
        }

        // diagonal up-right
        i = xPos;
        j = yPos;
        while (--i >= 0 && ++j < GameBoard.SIZE) {
            moves.add(new Cell(i, j));
        }

        // diagonal up-left
        i = xPos;
        j = yPos;
        while (--i >= 0 && --j >= 0) {
            moves.add(new Cell(i, j));
        }

        return moves;
    }

    @Override
    public String toString() {
        return super.toString('b');
    }
}
