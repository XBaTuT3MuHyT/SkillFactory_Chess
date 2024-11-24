package org.example;

import static java.lang.Math.abs;

public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

    int multColor = this.color == "White"? 1 : -1;
    int isFirstMove = ((this.color == "White") && (line == 1))||((this.color == "Black") && (line == 6)) ? 2 : 1;

    boolean move =  (column == toColumn)&&
            !(line == toLine)&&
            (((toLine - line) <= (multColor * isFirstMove) && color.equals("White"))||((toLine - line) >= (multColor * isFirstMove) && color.equals("Black")));

    boolean eat = (abs(column - toColumn) == 1) &&
            toLine - line == multColor &&
            chessBoard.board[toLine][toColumn] != null &&
            chessBoard.board[toLine][toColumn].color != this.color;

    return move || eat;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
