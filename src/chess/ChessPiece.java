package chess;

import boardgame.Board;
import boardgame.Piece;

// A classe ChessPiece será uma subclasse da classe Piece:
public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

}
