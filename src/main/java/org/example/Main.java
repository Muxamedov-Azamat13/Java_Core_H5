package org.example;

import static backup.TicTacToe.checkCells;

public class Main {
    public static void main(String[] args) {
        int[] board = {0, 1, 2, 1, 0, 2, 1, 1, 0};
        checkCells(board);
    }
}