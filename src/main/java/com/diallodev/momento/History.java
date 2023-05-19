package com.diallodev.momento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorSate> prevStates = new ArrayList<>();

    public void push(EditorSate state) {
        prevStates.add(state);
    }

    public EditorSate pop() {
        var lastIndex = prevStates.size() - 1;
        var lastState = prevStates.get(lastIndex);
        prevStates.remove(lastState);

        return lastState;
    }
}
