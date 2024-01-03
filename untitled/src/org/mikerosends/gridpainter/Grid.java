package org.mikerosends.gridpainter;

import java.util.Arrays;

public class Grid {

    public static final int cellSize = 20;
    public static final int padding = 10;
    private int rows;
    private int cols;

    private Cell[][] cells;

    public Grid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        cells = new Cell[rows][cols];

        drawGrid(rows, cols);
    }

    public void drawGrid(int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                cells[row][col] = new Cell(row, col);
            }
        }
    }


    public void clear() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; row < cols; col++) {
                cells[row][col].erase();
            }
        }
    }

    public Cell getCell(int row, int col) {
        System.out.println("row: " + row + " col " + col);
        return cells[row][col];
    }

    public int getRows() {
        System.out.println("The number of rows is: " + rows);
        return rows;
    }

    public int getCols() {
        System.out.println("The number of cols is: " + cols);
        return cols;
    }

}
