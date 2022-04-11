package com.tms.homework.astakhnovich.toDo.model;

public class Task {
    private String header;
    private String text;
    private Boolean isDone;

    public Task(String header, String text, Boolean isDone) {
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

    public void setDone(Boolean done) {
        isDone = done;
    }
}
