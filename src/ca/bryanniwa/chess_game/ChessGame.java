package ca.bryanniwa.chess_game;

import ca.bryanniwa.chess_game.model.LogicManager;
import ca.bryanniwa.chess_game.ui.TextUi;

public class ChessGame {
    public static void main(String[] args) {
        LogicManager logic = new LogicManager();
        TextUi ui = new TextUi();

        ui.printBoard(logic.getGameBoard());
        logic.start();
    }
}
