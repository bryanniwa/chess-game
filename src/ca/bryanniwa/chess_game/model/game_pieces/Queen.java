package ca.bryanniwa.chess_game.model.game_pieces;

import javafx.util.Pair;

import java.util.List;

public class Queen extends GamePiece{
    public Queen(Player player) {
        super(player);
    }

    @Override
    public List<Pair<Integer, Integer>> getMoves() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString('q');
    }
}
