package org.example;

import static java.lang.Math.abs;

public class King extends ChessPiece{
    public King(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return (((abs(line - toLine)) == 1) || (abs(column - toColumn) == 1)) &&
                positionInRange(toLine, toColumn)&&
                positionChanged(line, column, toLine, toColumn);

    }

    @Override
    public String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column){
        return false;
    }
}
