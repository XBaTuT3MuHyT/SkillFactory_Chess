package org.example;

import static java.lang.Math.abs;

public class Queen extends ChessPiece{
    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (((line != toLine)&&(column != toColumn)) && (abs(line - toLine) != abs(column - toColumn))) {
            return false;
        }
        if (((line == toLine)||(column == toColumn))){
            if (line == toLine) {
                int xDirection = toColumn > column ? 1 : -1; // Определяем направление по X
                int x = column + xDirection;

                while (x != toColumn ) {
                    if (chessBoard.board[x][line] != null) { // Если клетка занята
                        return false;
                    }
                    x += xDirection;
                }
            }
            if (column == toColumn) {
                int yDirection = toLine > line ? 1 : -1; // Определяем направление по Y
                int y = line + yDirection;
                while (y != toLine ) {
                    if (chessBoard.board[y][column] != null) { // Если клетка занята
                        return false;
                    }
                    y += yDirection;
                }
            }
        }

        if (abs(line - toLine) == abs(column - toColumn)){
            int xDirection = toColumn > column ? 1 : -1; // Определяем направление по X
            int yDirection = toLine > line ? 1 : -1; // Определяем направление по Y

            int x = column + xDirection;
            int y = line + yDirection;

            // Проверяем клетки на пути
            while (x != toColumn  && y != toLine) {
                if (chessBoard.board[x][y] != null) { // Если клетка занята
                    return false;
                }
                x += xDirection;
                y += yDirection;
            }
        }

        if ((chessBoard.board[toLine][toColumn] != null) && (chessBoard.board[toLine][toColumn].color.equals(this.color))){
            return false;
        }

        return true;

    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
