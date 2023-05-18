package day17;

public class Task2 {
    public static void main(String[] args) {
//        String[][] placing ={{ChessPiece.ROOK_BLACK.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.ROOK_BLACK.name,ChessPiece.KING_BLACK.name,ChessPiece.EMPTY.name},
//                            {ChessPiece.EMPTY.name,ChessPiece.ROOK_WHITE.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.PAWN_BLACK.name,ChessPiece.PAWN_BLACK.name,ChessPiece.EMPTY.name,ChessPiece.PAWN_BLACK.name},
//                            {ChessPiece.PAWN_BLACK.name,ChessPiece.EMPTY.name,ChessPiece.KNIGHT_BLACK.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.PAWN_BLACK.name,ChessPiece.EMPTY.name},
//                            {ChessPiece.QUEEN_BLACK.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.BISHOP_WHITE.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name},
//                            {ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.BISHOP_BLACK.name,ChessPiece.PAWN_WHITE.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name},
//                            {ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.BISHOP_WHITE.name,ChessPiece.PAWN_WHITE.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name},
//                            {ChessPiece.PAWN_WHITE.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.QUEEN_WHITE.name,ChessPiece.EMPTY.name,ChessPiece.PAWN_WHITE.name,ChessPiece.EMPTY.name,ChessPiece.PAWN_WHITE.name},
//                            {ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.EMPTY.name,ChessPiece.ROOK_WHITE.name,ChessPiece.KING_WHITE.name, ChessPiece.EMPTY.name}};
        String[][] placing = new String[8][8];

        for(int i = 0; i<placing.length;i++) {
            for (int j = 0; j < placing[i].length; j++)
                placing[i][j] = ChessPiece.EMPTY.name;
        }
        placing[0][0] = ChessPiece.ROOK_BLACK.name;
        placing[0][5] = ChessPiece.ROOK_BLACK.name;
        placing[0][6] = ChessPiece.KING_BLACK.name;
        placing[1][1] = ChessPiece.ROOK_WHITE.name;
        placing[1][4] = ChessPiece.PAWN_BLACK.name;
        placing[1][5] = ChessPiece.PAWN_BLACK.name;
        placing[1][7] = ChessPiece.PAWN_BLACK.name;
        placing[2][0] = ChessPiece.PAWN_BLACK.name;
        placing[2][2] = ChessPiece.KNIGHT_BLACK.name;
        placing[2][6] = ChessPiece.PAWN_BLACK.name;
        placing[3][0] = ChessPiece.QUEEN_BLACK.name;
        placing[3][3] = ChessPiece.BISHOP_WHITE.name;
        placing[4][3] = ChessPiece.BISHOP_BLACK.name;
        placing[4][4] = ChessPiece.PAWN_WHITE.name;
        placing[5][4] = ChessPiece.BISHOP_WHITE.name;
        placing[5][5] = ChessPiece.PAWN_WHITE.name;
        placing[6][0] = ChessPiece.PAWN_WHITE.name;
        placing[6][3] = ChessPiece.QUEEN_WHITE.name;
        placing[6][5] = ChessPiece.PAWN_WHITE.name;
        placing[6][7] = ChessPiece.PAWN_WHITE.name;
        placing[7][5] = ChessPiece.PAWN_WHITE.name;
        placing[7][6] = ChessPiece.KING_WHITE.name;



        ChessBoard cb = new ChessBoard(placing);
        cb.print();
    }

}
