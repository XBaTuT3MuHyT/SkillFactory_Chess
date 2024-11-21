package org.example;

abstract public class ChessPiece {

    public ChessPiece(String color){
        this.color = color;
    }
    String color;
    boolean check;

    public String getColor(){
        return color;
    }
    public static boolean positionInRange(int toLine, int toColumn){
        return (toLine >= 0) && (toLine <= 7) && (toColumn >= 0) && (toColumn <= 7);
    }
    abstract public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);
    abstract public String getSymbol();
}
