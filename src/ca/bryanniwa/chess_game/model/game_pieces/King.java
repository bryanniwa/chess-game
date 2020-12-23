package ca.bryanniwa.chess_game.model.game_pieces;

import javafx.util.Pair;

import java.util.List;

public class King extends GamePiece{
    public King(Player player) {
        super(player);
    }

    @Override
    public List<Pair<Integer, Integer>> getMoves() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString('K');
    }
}
