package ca.bryanniwa.chess_game.model;

public class Cell {
    private final int xPos;
    private final int yPos;

    public Cell(int x, int y) {
        xPos = x;
        yPos = y;
    }

    @Override
    public String toString() {
        return String.valueOf((char) (yPos + 'A')) + xPos;
    }
}
