package org.example;

import static java.lang.Math.abs;

public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return (abs(line - toLine) == abs(column - toColumn))&&
                positionChanged(line, column, toLine, toColumn)&&
                positionInRange(toLine, toColumn);
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
