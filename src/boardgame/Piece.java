package boardgame;

// A class Piece refere-se à peça do tabuleiro do jogo.
public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

}
