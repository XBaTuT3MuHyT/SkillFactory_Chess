package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse("white");
        Bishop bishop = new Bishop("white");
        Rook rook = new Rook("white");
        ChessBoard chessBoard = new ChessBoard("white");


        Scanner scanner = new Scanner(System.in);
        System.out.println("введите ряд: ");
        int line = scanner.nextInt();
        System.out.println("введите столбец: ");
        int column = scanner.nextInt();
        for(int i = -10; i<=10; i++){
            for(int j = -10; j<=10; j++){
                if (rook.canMoveToPosition(chessBoard, line, column, i, j)){
                    System.out.println(i+", "+j);
                }
            }
        }
    }
}