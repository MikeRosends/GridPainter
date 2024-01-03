package org.mikerosends.gridpainter;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;


public class KeyboardController implements KeyboardHandler {

    private MapEditor mapEditor;

    public KeyboardController(MapEditor mapEditor) {
        this.mapEditor = mapEditor;
        keyboardInit();
    }

    public void keyboardInit () {
        Keyboard keyboard = new Keyboard(this);
        KeyboardEvent[] events = new KeyboardEvent[9];

        for (int i = 0; i < events.length; i++) {
            events[i] = new KeyboardEvent();
        }

        events[0].setKey(KeyboardEvent.KEY_UP);
        events[0].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[1].setKey(KeyboardEvent.KEY_DOWN);
        events[1].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[2].setKey(KeyboardEvent.KEY_LEFT);
        events[2].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[3].setKey(KeyboardEvent.KEY_RIGHT);
        events[3].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[4].setKey(KeyboardEvent.KEY_SPACE);
        events[4].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[5].setKey(KeyboardEvent.KEY_SPACE);
        events[5].setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

/*        events[6].setKey(KeyboardEvent.KEY_S);
        events[6].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[7].setKey(KeyboardEvent.KEY_L);
        events[7].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[8].setKey(KeyboardEvent.KEY_C);
        events[8].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);*/

        for (int i = 0; i < events.length; i++) {
            keyboard.addEventListener(events[i]);
        }
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                mapEditor.moveCursor(Cursor.Direction.UP);
                break;
            case KeyboardEvent.KEY_DOWN:
                mapEditor.moveCursor(Cursor.Direction.DOWN);
                break;
            case KeyboardEvent.KEY_LEFT:
                mapEditor.moveCursor(Cursor.Direction.LEFT);
                break;
            case KeyboardEvent.KEY_RIGHT:
                mapEditor.moveCursor(Cursor.Direction.RIGHT);
                break;
            case KeyboardEvent.KEY_SPACE:
                mapEditor.setPainting(true);
                mapEditor.paintCell();
                break;
            /*case KeyboardEvent.KEY_C:
                mapEditor.clear();
                break;
            case KeyboardEvent.KEY_S:
                mapEditor.save();
                break;
            case KeyboardEvent.KEY_L:
                mapEditor.load();
                break;*/
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) {
            mapEditor.setPainting(false);
        }

    }
}
