package org.example;

public class Rook extends ChessPiece{
    public Rook(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if ((line != toLine)&&(column != toColumn)){
            return false;
        }
        if (line == toLine) {
            int xDirection = toColumn > column ? 1 : -1; // Определяем направление по X
            int x = column + xDirection;

            while (x != toColumn) {
                if (chessBoard.board[x][line] != null) { // Если клетка занята
                    return false;
                }
                x += xDirection;
            }
        }
        if (column == toColumn) {
            int yDirection = toLine > line ? 1 : -1; // Определяем направление по Y
            int y = line + yDirection;
            while (y != toLine) {
                if (chessBoard.board[y][column] != null) { // Если клетка занята
                    return false;
                }
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
        return "R";
    }
}
