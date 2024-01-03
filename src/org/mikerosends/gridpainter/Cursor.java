package org.mikerosends.gridpainter;

import org.academiadecodigo.simplegraphics.graphics.Color;

import static org.mikerosends.gridpainter.Grid.cellSize;

public class Cursor extends Cell {

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public Cursor() {
        super(0, 0);
        rectangle.setColor(Color.PINK);
        paint();
    }

    public void moveUp() {
        row--;
        rectangle.translate(0, -cellSize);
    }

    public void moveDown() {
        row++;
        rectangle.translate(0, +cellSize);
    }

    public void moveLeft() {
        col--;
        rectangle.translate(-cellSize, 0);
    }

    public void moveRight() {
        col++;
        rectangle.translate(+cellSize, 0);
    }



}
