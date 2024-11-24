package org.example;

import static java.lang.Math.abs;

public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (abs(line - toLine) != abs(column - toColumn)) {
            return false; // Не на одной диагонали
        }

        int xDirection = toColumn > column ? 1 : -1; // Определяем направление по X
        int yDirection = toLine > line ? 1 : -1; // Определяем направление по Y

        int x = column + xDirection;
        int y = line + yDirection;

        // Проверяем клетки на пути
        while (x != toColumn  && y != toLine ) {
            if (chessBoard.board[x][y] != null){// Если клетка занята
                return false;
            }
            x += xDirection;
            y += yDirection;
        }

        if ((chessBoard.board[toLine][toColumn] != null) && (chessBoard.board[toLine][toColumn].color.equals(this.color))){
            return false;
        }
        return true;

    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
