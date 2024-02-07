package chess;

import boardgame.Board;

// A classe ChessMatch será o "coração" do sistema de xadrez. Nessa classe ficarão as regras de negócio da aplicação.
public class ChessMatch {

    // Uma partida de xadrez precisa ter um tabuleiro:
    private Board board;

    public ChessMatch() {
        // A classe responsável pela dimensão de um tabuleiro de xadrez é a classe ChessMatch!
        board = new Board(8, 8);
    }

    // Esse método retorna uma matriz de peças de xadrez (pieces) correspondentes com a partida (ChessMatch):
    public ChessPiece[][] getPieces() {
        // Variável temporária:
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        // Percorremos a matriz de peças (pieces) do tabuleiro (board) e para cada peça do tabuleiro fazemos um downcast
        // para ChessPiece:
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

}
