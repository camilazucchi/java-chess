package boardgame;

// A class Board refere-se ao tabuleiro do jogo.
public class Board {

    private int rows;
    private int columns;

    // Matriz de peças (pieces):
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    // Esse método retorna a matriz Pieces na linha e na coluna especificada:
    public Piece piece(int row, int column) {
        return pieces[row][column];
    }

    // Esse método retorna a peça (piece) pela posição (position):
    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }

    // Esse método adiciona uma peça (piece) em uma posição (position) dentro da matriz de peças (pieces):
    public void placePiece(Piece piece, Position position) {
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }



}
