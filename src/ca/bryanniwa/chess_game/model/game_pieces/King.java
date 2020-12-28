package ca.bryanniwa.chess_game.model.game_pieces;

import ca.bryanniwa.chess_game.model.Cell;
import javafx.util.Pair;

import java.util.List;

public class King extends GamePiece{
    public King(PlayerEnum playerEnum) {
        super(playerEnum);
    }

    @Override
    public List<Cell> getMoves(int xPos, int yPos) {
        return null;
    }

    @Override
    public String toString() {
        return super.toString('K');
    }
}
