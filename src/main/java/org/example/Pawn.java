package org.example;

public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

    int multColor = this.color == "white"? 1 : -1;
    int isFirstMove = ((this.color == "white") && (line == 1))||((this.color == "black") && (line == 6)) ? 2 : 1;
        return (column == toColumn)&&
                ((toLine - line) <= (multColor * isFirstMove));
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
