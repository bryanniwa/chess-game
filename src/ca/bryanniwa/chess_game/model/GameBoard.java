package ca.bryanniwa.chess_game.model;

import ca.bryanniwa.chess_game.model.game_pieces.PieceEnum;
import ca.bryanniwa.chess_game.model.game_pieces.PlayerEnum;
import ca.bryanniwa.chess_game.model.game_pieces.GamePiece;
import ca.bryanniwa.chess_game.model.game_pieces.GamePieceFactory;

public class GameBoard {
    private final GamePiece[][] gameBoard;

    public GameBoard() {
        gameBoard = new GamePiece[8][8];
        init();
    }

    public void init() {

        // Black Pieces
        gameBoard[0][7] = GamePieceFactory.getPiece(PieceEnum.ROOK, PlayerEnum.black);
        gameBoard[0][0] = GamePieceFactory.getPiece(PieceEnum.ROOK, PlayerEnum.black);
        gameBoard[0][1] = GamePieceFactory.getPiece(PieceEnum.KNIGHT, PlayerEnum.black);
        gameBoard[0][6] = GamePieceFactory.getPiece(PieceEnum.KNIGHT, PlayerEnum.black);
        gameBoard[0][2] = GamePieceFactory.getPiece(PieceEnum.BISHOP, PlayerEnum.black);
        gameBoard[0][5] = GamePieceFactory.getPiece(PieceEnum.BISHOP, PlayerEnum.black);
        gameBoard[0][3] = GamePieceFactory.getPiece(PieceEnum.QUEEN, PlayerEnum.black);
        gameBoard[0][4] = GamePieceFactory.getPiece(PieceEnum.KING, PlayerEnum.black);

        for (int i = 0; i < gameBoard[1].length; i++) {
            gameBoard[1][i] = GamePieceFactory.getPiece(PieceEnum.PAWN, PlayerEnum.black);
        }

        // White Pieces
        for (int i = 0; i < gameBoard[6].length; i++) {
            gameBoard[6][i] = GamePieceFactory.getPiece(PieceEnum.PAWN, PlayerEnum.white);
        }

        gameBoard[7][0] = GamePieceFactory.getPiece(PieceEnum.ROOK, PlayerEnum.white);
        gameBoard[7][7] = GamePieceFactory.getPiece(PieceEnum.ROOK, PlayerEnum.white);
        gameBoard[7][1] = GamePieceFactory.getPiece(PieceEnum.KNIGHT, PlayerEnum.white);
        gameBoard[7][6] = GamePieceFactory.getPiece(PieceEnum.KNIGHT, PlayerEnum.white);
        gameBoard[7][2] = GamePieceFactory.getPiece(PieceEnum.BISHOP, PlayerEnum.white);
        gameBoard[7][5] = GamePieceFactory.getPiece(PieceEnum.BISHOP, PlayerEnum.white);
        gameBoard[7][3] = GamePieceFactory.getPiece(PieceEnum.QUEEN, PlayerEnum.white);
        gameBoard[7][4] = GamePieceFactory.getPiece(PieceEnum.KING, PlayerEnum.white);
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
