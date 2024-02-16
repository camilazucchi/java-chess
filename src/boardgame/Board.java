package boardgame;

// A class Board refere-se ao tabuleiro do jogo.
public class Board {

    private int rows;
    private int columns;

    // Matriz de peças (pieces):
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            throw new BoardException("There was an error while creating your board: the board must have at least" +
                    "1 row and 1 column.");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }


    public int getColumns() {
        return columns;
    }


    // Esse método retorna a matriz Pieces na linha e na coluna especificada:
    public Piece piece(int row, int column) {
        if (!positionExists(row, column)) {
            throw new BoardException("The position is not on the board.");
        }
        return pieces[row][column];
    }

    // Esse método retorna a peça (piece) pela posição (position):
    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }

    // Esse método adiciona uma peça (piece) em uma posição (position) dentro da matriz de peças (pieces):
    public void placePiece(Piece piece, Position position) {
        if (thereIsAPiece(position)) {
            throw new BoardException("There is already a piece on the position: " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    // Esses métodos testam se uma posição existe:
    private boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("The position is not on the board.");
        }
        return piece(position) != null;
    }



}
