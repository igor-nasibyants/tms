package com.tms.homework.han.todo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public interface UpdateTodo {
    default void getUpdateTodo(FileOutputStream file, String input) throws IOException {
        file.write(input.getBytes(StandardCharsets.UTF_8));
        file.close();
    }
}
