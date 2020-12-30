package ca.bryanniwa.chess_game.model.game_pieces;

import ca.bryanniwa.chess_game.model.Cell;
import ca.bryanniwa.chess_game.model.GameBoard;

import java.util.ArrayList;
import java.util.List;

public class Rook extends GamePiece{
    private boolean hasMoved = false;

    public Rook(PlayerEnum playerEnum) {
        super(playerEnum);
    }

    @Override
    public List<Cell> getMoves(int xPos, int yPos) {
        List<Cell> moves = new ArrayList<>();

        // up
        int j = yPos;
        while (--j >= 0) {
            moves.add(new Cell(xPos, j));
        }

        // down
        j = yPos;
        while (++j < GameBoard.SIZE) {
            moves.add(new Cell(xPos, j));
        }

        // left
        int i = xPos;
        while (--i >= 0) {
            moves.add(new Cell(i, yPos));
        }

        // right
        i = xPos;
        while (++i < GameBoard.SIZE) {
            moves.add(new Cell(i, yPos));
        }

        return moves;
    }

    @Override
    public String toString() {
        return super.toString('r');
    }

    public boolean isHasMoved() {
        return hasMoved;
    }

    public void setHasMoved(boolean hasMoved) {
        this.hasMoved = hasMoved;
    }
}
