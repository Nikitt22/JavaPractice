package day17;

public class Task1 {
    public static void main(String[] args) {
String[] array = new String[8];
array[0] = ChessPiece.PAWN_WHITE.name;
array[1] = ChessPiece.PAWN_WHITE.name;
array[2] = ChessPiece.PAWN_WHITE.name;
array[3] = ChessPiece.PAWN_WHITE.name;

array[4] = ChessPiece.ROOK_BLACK.name;
array[5] = ChessPiece.ROOK_BLACK.name;
array[6] = ChessPiece.ROOK_BLACK.name;
array[7] = ChessPiece.ROOK_BLACK.name;

for(String x: array){
    String item = x;
    System.out.print(item + "  ");}
    }
}