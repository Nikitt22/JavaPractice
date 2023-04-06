package day17;

public class Task2 {
    public static void main(String[] args) {
        String[][] placing ={{ChessPiece.ROOK_BLACK.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.ROOK_BLACK.name,ChessPiece.KING_BLACK.name,ChessPiece.EMPTY.name},
                            {ChessPiece.EMPTY.name,ChessPiece.ROOK_WHITE.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.PAWN_BLACK.name,ChessPiece.PAWN_BLACK.name,ChessPiece.EMPTY.name,ChessPiece.PAWN_BLACK.name},
                            {ChessPiece.PAWN_BLACK.name,ChessPiece.EMPTY.name,ChessPiece.KNIGHT_BLACK.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.PAWN_BLACK.name,ChessPiece.EMPTY.name},
                            {ChessPiece.QUEEN_BLACK.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.BISHOP_WHITE.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name},
                            {ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.BISHOP_BLACK.name,ChessPiece.PAWN_WHITE.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name},
                            {ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.BISHOP_WHITE.name,ChessPiece.PAWN_WHITE.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name},
                            {ChessPiece.PAWN_WHITE.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.QUEEN_WHITE.name,ChessPiece.EMPTY.name,ChessPiece.PAWN_WHITE.name,ChessPiece.EMPTY.name,ChessPiece.PAWN_WHITE.name},
                            {ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.ROOK_WHITE.name,ChessPiece.KING_WHITE.name, ChessPiece.EMPTY.name}};
        ChessBoard cb = new ChessBoard(placing);
        cb.print();
    }

}
