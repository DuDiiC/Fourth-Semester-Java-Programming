package com.company;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        boolean[][] tmp = new boolean[10][10];
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                tmp[i][j] = false;
            }
        }

        tmp[3][3] = true;
        tmp[3][4] = true;
		tmp[3][5] = true;
        tmp[4][3] = true;
        tmp[5][4] = true;

        Board board = new Board(10, tmp);
        while(true) {
            board.printBoard();
            System.out.println();
            try {
                TimeUnit.MILLISECONDS.sleep(350);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            board.updateBoardState();
        }
    }
}
