package ca.bryanniwa.chess_game.model.game_pieces;

public class GamePieceFactory {

    public static GamePiece getPiece(PieceEnum pieceType, PlayerEnum playerEnum) {
        return switch (pieceType) {
            case BISHOP -> new Bishop(playerEnum);
            case KING -> new King(playerEnum);
            case KNIGHT -> new Knight(playerEnum);
            case PAWN -> new Pawn(playerEnum);
            case QUEEN -> new Queen(playerEnum);
            case ROOK -> new Rook(playerEnum);
        };
    }
}
