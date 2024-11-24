package org.example;

public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

    int multColor = this.color == "White"? 1 : -1;
    int isFirstMove = ((this.color == "White") && (line == 1))||((this.color == "Black") && (line == 6)) ? 2 : 1;
        return (column == toColumn)&&
                !(line == toLine)&&
                (((toLine - line) <= (multColor * isFirstMove) && color.equals("White"))||((toLine - line) >= (multColor * isFirstMove) && color.equals("Black")))&&
                positionInRange(toLine, toColumn);
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
