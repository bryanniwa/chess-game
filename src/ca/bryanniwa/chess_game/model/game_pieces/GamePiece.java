package ca.bryanniwa.chess_game.model.game_pieces;

import javafx.util.Pair;

import java.util.List;

public abstract class GamePiece {
    private final Player player;

    public GamePiece(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public abstract List<Pair<Integer, Integer>> getMoves();

    public String toString(char c) {
        return (player == Player.black ? "b" : "w") + c;
    }
}

