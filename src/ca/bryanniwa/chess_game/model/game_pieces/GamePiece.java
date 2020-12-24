package ca.bryanniwa.chess_game.model.game_pieces;

import javafx.util.Pair;

import java.util.List;

public abstract class GamePiece {
    private final PlayerEnum playerEnum;

    public GamePiece(PlayerEnum playerEnum) {
        this.playerEnum = playerEnum;
    }

    public PlayerEnum getPlayer() {
        return playerEnum;
    }

    public abstract List<Pair<Integer, Integer>> getMoves();

    public String toString(char c) {
        return (playerEnum == PlayerEnum.black ? "b" : "w") + c;
    }
}

