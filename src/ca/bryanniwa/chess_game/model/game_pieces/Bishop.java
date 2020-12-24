package ca.bryanniwa.chess_game.model.game_pieces;

import javafx.util.Pair;

import java.util.List;

public class Bishop extends GamePiece{
    public Bishop(PlayerEnum playerEnum) {
        super(playerEnum);
    }

    @Override
    public List<Pair<Integer, Integer>> getMoves() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString('b');
    }
}
