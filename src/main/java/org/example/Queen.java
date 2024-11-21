package org.example;

import static java.lang.Math.abs;

public class Queen extends ChessPiece{
    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return ((abs(line - toLine) == abs(column - toColumn))||((line == toLine)||(column == toColumn)))&&
                positionInRange(toLine, toColumn)&&
                positionChanged(line, column, toLine, toColumn) ;
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
