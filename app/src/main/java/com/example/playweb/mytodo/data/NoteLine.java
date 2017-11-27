package com.example.playweb.mytodo.data;

/**
 * Created by Vladyslav on 22.11.2017
 */

public class NoteLine {
    private boolean isDone;
    private String line;

    public NoteLine(String line) {
        this.line = line;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public String getLine() {
        return line;
    }
}
