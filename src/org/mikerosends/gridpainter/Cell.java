package org.mikerosends.gridpainter;


import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import static org.mikerosends.gridpainter.Grid.cellSize;
import static org.mikerosends.gridpainter.Grid.padding;

public class Cell {

    int row;
    int col;
    Rectangle rectangle;
    private boolean painted;

    public Cell(int row, int col){
        this.row = row;
        this.col = col;
        rectangle = new Rectangle(col * cellSize + padding, row * cellSize, cellSize, cellSize);
        rectangle.draw();
    }

    public void paint() {
        painted = true;
        rectangle.fill();
    }

    public void erase() {
        painted = false;
        rectangle.draw();
    }

    public int getRow() {
        System.out.println("Getting Row: " + row);
        return row;
    }

    public int getCol() {
        System.out.println("Getting Col: " + col);
        return col;
    }

    public boolean isPainted() {
        return painted;
    }
}
