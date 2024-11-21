package org.example;

import static java.lang.Math.abs;

public class Horse extends ChessPiece{
    public Horse(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return (((abs(column - toColumn) == 2) && (abs(line - toLine) == 1)) ||
                ((abs(column - toColumn) == 1) && (abs(line - toLine) == 2))) &&
                positionInRange(toLine, toColumn);
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
