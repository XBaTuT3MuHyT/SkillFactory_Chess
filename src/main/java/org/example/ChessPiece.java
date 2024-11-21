package org.example;

abstract public class ChessPiece {
    String color;
    boolean check;

    public String getColor(){
        return color;
    }
    abstract public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);
    abstract public String getSymbol();
}
