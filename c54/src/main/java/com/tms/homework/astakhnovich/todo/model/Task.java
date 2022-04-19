package com.tms.homework.astakhnovich.todo.model;

public class Task {
    private String header;
    private String text;
    private boolean isDone;

    public Task() {
    }

    public Task(String header, String text, boolean isDone) {
        this.header = header;
        this.text = text;
        this.isDone = isDone;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public void setDoneTrue() {
        isDone = true;
    }

    @Override
    public String toString() {
        return "" +
                "\nheader: " + header +
                "\ntask: " + text +
                "\ntask completed? " + isDone;
    }
}