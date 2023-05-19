package com.diallodev;

import com.diallodev.momento.Editor;
import com.diallodev.momento.History;
import com.diallodev.state.BrushTool;
import com.diallodev.state.Canvas;
import com.diallodev.state.EraseTool;
import com.diallodev.state.SelectionTool;
import com.diallodev.state.abuse.Stopwatch;

public class Main {
    public static void main(String[] args) {

//        var editor = new Editor();
//        var history = new History();
//        editor.setContent("a");
//        history.push(editor.createState());
//
//        editor.setContent("b");
//        history.push(editor.createState());
//
//        editor.setContent("c");
//        editor.restore(history.pop());
//
//        System.out.println(editor.getContent());

//        var canvas = new Canvas();
//        canvas.setCurrentTool(new EraseTool());
//        canvas.mouseDown();
//        canvas.mouseUp();

        var stopwatch = new Stopwatch();
        stopwatch.click();
        stopwatch.click();
        stopwatch.click();
    }
}