package com.company;

public class Board {

    private int boardSize;
    private boolean[][] board;

    public Board(int boardSize) throws IllegalArgumentException {
        if(boardSize <= 0) {
            throw new IllegalArgumentException();
        }
        this.boardSize = boardSize;
        board = new boolean[boardSize][boardSize];
        for(int i = 0; i < boardSize; i++) {
            for(int j = 0; j < boardSize; j++) {
                board[i][j] = false;
            }
        }
    }

    public Board(int boardSize, boolean[][] board) throws IllegalArgumentException {
        if(boardSize <= 0 || board.length != boardSize || board[0].length != boardSize) {
            throw new IllegalArgumentException();
        }
        this.boardSize = boardSize;
        this.board = copyBoard(board);
    }

    public int getBoardSize() {
        return boardSize;
    }

    public boolean[][] getBoard() {
        return board;
    }

    public void setBoard(boolean[][] board) throws IllegalArgumentException {
        if(incorrectBoardSize(board)) {
            throw new IllegalArgumentException();
        }
        this.board = copyBoard(board);
    }

    public boolean getCell(int x, int y) {
        return board[x][y];
    }

    public void setCell(int x, int y, boolean value) {
        board[x][y] = value;
    }

    public void updateBoardState() {
        boolean[][] actualState = copyBoard(board);
        for(int i = 0; i < boardSize; i++) {
            for(int j = 0; j < boardSize; j++) {
                checkCellState(i, j, actualState);
            }
        }
    }

    public void checkCellState(int x, int y, boolean[][] actualState)
            throws IllegalArgumentException {
        if(incorrectCellPosition(x, y) || incorrectBoardSize(actualState)) {
            throw new IllegalArgumentException();
        }

        if(actualState[x][y]) { // cell is alive
            if(killTheCell(x, y, actualState)) {
                board[x][y] = false;
            }
        } else { // if it's dead
            if(reviveTheCell(x, y, actualState)) {
                board[x][y] = true;
            }
        }
    }

    public int numberOfLivingNeighbors(int x, int y, boolean[][] actualState)
            throws IllegalArgumentException {
        if(incorrectCellPosition(x, y) || incorrectBoardSize(actualState)) {
            throw new IllegalArgumentException();
        }

        int sum = 0;
        return getSum(x, y, actualState, sum);
    }

    public void printBoard() {
        for(int i = 0; i < boardSize; i++) {
            for(int j = 0; j < boardSize; j++) {
                if(board[i][j]) System.out.print("o");
                else System.out.print("-");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private boolean[][] copyBoard(boolean[][] from) {
        boolean[][] to = new boolean[boardSize][boardSize];
        for(int i = 0; i < boardSize; i++) {
            for(int j = 0; j < boardSize; j++) {
                to[i][j] = from[i][j];
            }
        }
        return to;
    }

    private boolean incorrectBoardSize(boolean[][] actualState) {
        return actualState.length != actualState[0].length || actualState.length != boardSize;
    }

    private boolean incorrectCellPosition(int x, int y) {
        return x < 0 || x > boardSize - 1 || y < 0 || y > boardSize - 1;
    }

    private boolean reviveTheCell(int x, int y, boolean[][] actualState) {
        return numberOfLivingNeighbors(x, y, actualState) == 3;
    }

    private boolean killTheCell(int x, int y, boolean[][] actualState) {
        return numberOfLivingNeighbors(x, y, actualState) > 3 || numberOfLivingNeighbors(x, y, actualState) < 2;
    }

    private int getSum(int x, int y, boolean[][] actualState, int sum) {
        if(x-1 >= 0 && y-1 >= 0) {
            if (actualState[x - 1][y - 1]) sum++;
        }
        if(x-1 >= 0) {
            if(actualState[x-1][y]) sum++;
        }
        if(x-1 >= 0 && y+1 < boardSize) {
            if(actualState[x-1][y+1]) sum++;
        }
        if(y+1 < boardSize) {
            if (actualState[x][y + 1]) sum++;
        }
        if (x+1 < boardSize && y+1 < boardSize) {
            if(actualState[x+1][y+1]) sum++;
        }
        if(x+1 < boardSize) {
            if(actualState[x+1][y]) sum++;
        }
        if(x+1 < boardSize && y-1 >= 0) {
            if(actualState[x+1][y-1]) sum++;
        }
        if(y-1 >= 0) {
            if(actualState[x][y-1]) sum++;
        }
        return sum;
    }
}
