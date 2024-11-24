package org.example;

import static java.lang.Math.abs;

public class King extends ChessPiece{
    public King(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if ((chessBoard.board[toLine][toColumn] != null) && (chessBoard.board[toLine][toColumn].color.equals(this.color))){
            return false;
        }
        return (((abs(line - toLine)) == 1) || (abs(column - toColumn) == 1)) &&
                positionInRange(toLine, toColumn)&&
                positionChanged(line, column, toLine, toColumn);

    }

    @Override
    public String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column){
        for (int i = 0; i <= 7; i++){
            for (int j = 0; j <= 7; j++){
                if (board.board[i][j].canMoveToPosition(board, i, j, line, column)){
                    return true;
                }
            }
        }
        return false;
    }
}
