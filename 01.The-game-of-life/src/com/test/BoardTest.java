package com.test;

import com.company.Board;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoardTest {

    private Board testBoard;
    private boolean[][] board;

    @BeforeEach
    void setUp() {

        board = new boolean[9][9];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                board[i][j] = false;
            }
        }

        board[0][0] = true; board[0][1] = true; board[0][7] = true;
        board[0][8] = true; board[1][7] = true; board[1][8] = true;
        board[2][1] = true; board[3][0] = true; board[3][1] = true;
        board[3][5] = true; board[4][1] = true; board[4][4] = true;
        board[4][5] = true; board[5][3] = true; board[6][0] = true;
        board[6][1] = true; board[6][5] = true; board[7][0] = true;
        board[7][1] = true; board[7][2] = true; board[7][5] = true;
        board[8][0] = true; board[8][1] = true; board[8][2] = true;
        board[8][5] = true; board[8][7] = true;


        /*
         * it's a board:
         * o o - - - - - o o
         * - - - - - - - o o
         * - o - - - - - - -
         * o o - - - o - - -
         * - o - - o o - - -
         * - - - o - - - - -
         * o o - - - o - - -
         * o o o - - o - - -
         * o o o - - o - o -
         */

        Assertions.assertDoesNotThrow(() -> testBoard = new Board(9, board));
    }

    @Test
    void testBoardConstructorThrows() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> testBoard = new Board(-3));

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> testBoard = new Board(0));

        boolean[][] testBoard1 = new boolean[testBoard.getBoardSize()][8];
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> testBoard = new Board(testBoard.getBoardSize(), testBoard1));

        boolean[][] testBoard2 = new boolean[8][8];
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> testBoard = new Board(testBoard.getBoardSize(), testBoard2));

        boolean[][] testBoard3 = new boolean[testBoard.getBoardSize()][testBoard.getBoardSize()];
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> testBoard = new Board(-2, testBoard3));
        Assertions.assertDoesNotThrow(() -> testBoard = new Board(testBoard.getBoardSize(), testBoard3));
    }

    @Test
    void testCheckCellStateThrows() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> testBoard.checkCellState(-2,1, testBoard.getBoard()));
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> testBoard.checkCellState(3,-1, testBoard.getBoard()));
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> testBoard.checkCellState(9,10, testBoard.getBoard()));
        Assertions.assertDoesNotThrow(() -> testBoard.checkCellState(3, 4, testBoard.getBoard()));
    }

    @Test
    void testCheckCellStateFirstRule() {
        // If a living cell has less than 2 living neighbors, it dies of loneliness

        Assertions.assertTrue(testBoard.getCell(0, 0));
        testBoard.checkCellState(0, 0, testBoard.getBoard());
        Assertions.assertFalse(testBoard.getCell(0, 0));

        Assertions.assertTrue(testBoard.getCell(6, 5));
        testBoard.checkCellState(6, 5, testBoard.getBoard());
        Assertions.assertFalse(testBoard.getCell(6, 5));

        Assertions.assertTrue(testBoard.getCell(5, 3));
        testBoard.checkCellState(5, 3, testBoard.getBoard());
        Assertions.assertFalse(testBoard.getCell(5, 3));
    }

    @Test
    void testCheckCellStateSecondRule() {
        // If a living cell has 2 or 3 living neighbors it survives until the next turn

        Assertions.assertTrue(testBoard.getCell(2, 1));
        testBoard.checkCellState(2, 1, testBoard.getBoard());
        Assertions.assertTrue(testBoard.getCell(2, 1));

        Assertions.assertTrue(testBoard.getCell(7, 5));
        testBoard.checkCellState(7, 5, testBoard.getBoard());
        Assertions.assertTrue(testBoard.getCell(7, 5));

        Assertions.assertTrue(testBoard.getCell(4, 4));
        testBoard.checkCellState(4, 4, testBoard.getBoard());
        Assertions.assertTrue(testBoard.getCell(4, 4));

        Assertions.assertTrue(testBoard.getCell(0, 8));
        testBoard.checkCellState(0, 8, testBoard.getBoard());
        Assertions.assertTrue(testBoard.getCell(0, 8));
    }

    @Test
    void testCheckCellStateThirdRule() {
        // If a living cell has more than 3 living neighbors, it dies from overcrowding

        Assertions.assertTrue(testBoard.getCell(8, 1));
        testBoard.checkCellState(8, 1, testBoard.getBoard());
        Assertions.assertFalse(testBoard.getCell(8, 1));

        Assertions.assertTrue(testBoard.getCell(7, 0));
        testBoard.checkCellState(7, 0, testBoard.getBoard());
        Assertions.assertFalse(testBoard.getCell(7, 0));

        Assertions.assertTrue(testBoard.getCell(7, 1));
        testBoard.checkCellState(7, 1, testBoard.getBoard());
        Assertions.assertFalse(testBoard.getCell(7, 1));
    }

    @Test
    void testCheckCellStateFourthRule() {
        // If the dead cell has exactly 3 living neighbors, it comes alive

        Assertions.assertFalse(testBoard.getCell(7, 4));
        testBoard.checkCellState(7, 4, testBoard.getBoard());
        Assertions.assertTrue(testBoard.getCell(7, 4));

        Assertions.assertFalse(testBoard.getCell(3, 4));
        testBoard.checkCellState(3, 4, testBoard.getBoard());
        Assertions.assertTrue(testBoard.getCell(3, 4));

        Assertions.assertFalse(testBoard.getCell(8, 6));
        testBoard.checkCellState(8, 6, testBoard.getBoard());
        Assertions.assertTrue(testBoard.getCell(8, 6));

        Assertions.assertFalse(testBoard.getCell(3, 2));
        testBoard.checkCellState(3, 2, testBoard.getBoard());
        Assertions.assertTrue(testBoard.getCell(3, 2));
    }

    @Test
    void testNumberOfLivingNeighborsThrows() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> testBoard.numberOfLivingNeighbors(-3, 4, testBoard.getBoard()));
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> testBoard.numberOfLivingNeighbors(4, -1, testBoard.getBoard()));
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> testBoard.numberOfLivingNeighbors(10,9, testBoard.getBoard()));
        Assertions.assertDoesNotThrow(() -> testBoard.numberOfLivingNeighbors(3, 4, testBoard.getBoard()));
    }

    @Test
    void testNumberOfLivingNeighborsInTheCorner() {
        Assertions.assertEquals(1, testBoard.numberOfLivingNeighbors(0, 0, testBoard.getBoard()));
        Assertions.assertEquals(3, testBoard.numberOfLivingNeighbors(0, 8, testBoard.getBoard()));
        Assertions.assertEquals(3, testBoard.numberOfLivingNeighbors(8, 0, testBoard.getBoard()));
        Assertions.assertEquals(1, testBoard.numberOfLivingNeighbors(8, 8, testBoard.getBoard()));
    }

    @Test
    void testNumberOfLivingNeighborsOnTheEdge() {
        Assertions.assertEquals(3, testBoard.numberOfLivingNeighbors(1, 0, testBoard.getBoard()));
        Assertions.assertEquals(3, testBoard.numberOfLivingNeighbors(3, 0, testBoard.getBoard()));
        Assertions.assertEquals(3, testBoard.numberOfLivingNeighbors(0, 7, testBoard.getBoard()));
        Assertions.assertEquals(2, testBoard.numberOfLivingNeighbors(8, 4, testBoard.getBoard()));
        Assertions.assertEquals(1, testBoard.numberOfLivingNeighbors(7, 8, testBoard.getBoard()));
        Assertions.assertEquals(0, testBoard.numberOfLivingNeighbors(6, 8, testBoard.getBoard()));
    }

    @Test
    void testNumberOfLivingNeighborsInTheCenter() {
        Assertions.assertEquals(1, testBoard.numberOfLivingNeighbors(2, 5, testBoard.getBoard()));
        Assertions.assertEquals(2, testBoard.numberOfLivingNeighbors(2, 6, testBoard.getBoard()));
        Assertions.assertEquals(3, testBoard.numberOfLivingNeighbors(4, 2, testBoard.getBoard()));
        Assertions.assertEquals(4, testBoard.numberOfLivingNeighbors(5, 4, testBoard.getBoard()));
        Assertions.assertEquals(3, testBoard.numberOfLivingNeighbors(3, 1, testBoard.getBoard()));
        Assertions.assertEquals(7, testBoard.numberOfLivingNeighbors(7, 1, testBoard.getBoard()));
        Assertions.assertEquals(0, testBoard.numberOfLivingNeighbors(4, 7, testBoard.getBoard()));
    }
}
