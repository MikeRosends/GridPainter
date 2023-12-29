package org.mikerosends.gridpainter;

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
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                cells[r][c] = new Cell(r, c);
            }
        }
    }


    public void clear() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; i < cols; j++) {
                cells[i][j].erase();
            }
        }
    }

}
