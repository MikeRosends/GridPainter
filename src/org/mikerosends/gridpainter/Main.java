package org.mikerosends.gridpainter;

public class Main {
    public static void main(String[] args) {
        MapEditor mapEditor = new MapEditor(20, 20);
        new KeyboardController(mapEditor);

    }
}
