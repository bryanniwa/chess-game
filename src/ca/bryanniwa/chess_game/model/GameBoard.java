package ca.bryanniwa.chess_game.model;

import ca.bryanniwa.chess_game.model.game_pieces.*;

public class GameBoard {
    private final GamePiece[][] gameBoard;

    public GameBoard() {
        gameBoard = new GamePiece[8][8];
        init();
    }

    public void init() {
        // Black Pieces
        gameBoard[0][0] = new Rook(Player.black);
        gameBoard[0][7] = new Rook(Player.black);

        gameBoard[0][1] = new Knight(Player.black);
        gameBoard[0][6] = new Knight(Player.black);

        gameBoard[0][2] = new Bishop(Player.black);
        gameBoard[0][5] = new Bishop(Player.black);

        gameBoard[0][3] = new Queen(Player.black);
        gameBoard[0][4] = new King(Player.black);

        for (int i = 0; i < gameBoard[1].length; i++) {
            gameBoard[1][i] = new Pawn(Player.black);
        }

        // White Pieces
        for (int i = 0; i < gameBoard[6].length; i++) {
            gameBoard[6][i] = new Pawn(Player.white);
        }

        gameBoard[7][0] = new Rook(Player.white);
        gameBoard[7][7] = new Rook(Player.white);

        gameBoard[7][1] = new Knight(Player.white);
        gameBoard[7][6] = new Knight(Player.white);

        gameBoard[7][2] = new Bishop(Player.white);
        gameBoard[7][5] = new Bishop(Player.white);

        gameBoard[7][3] = new Queen(Player.white);
        gameBoard[7][4] = new King(Player.white);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (var boardRow : gameBoard) {
            for (GamePiece piece : boardRow) {
                if (piece == null) {
                    res.append("**");
                } else {
                    res.append(piece);
                }
                res.append(" ");
            }
            res.append("\n");
        }
        return res.toString();
    }
}
