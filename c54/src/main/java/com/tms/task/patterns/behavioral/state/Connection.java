package com.tms.task.patterns.behavioral.state;

public interface Connection {

    void open();

    void close();

    void log();

    void update();
}
