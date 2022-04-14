package com.tms.homework.han.todo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public interface UpdateFile {

    default void updateFile(List<String> list, String path) {
        try {
            new FileOutputStream(path)
                    .close();
        } catch (IOException e) {
            System.err.println("Файл не был очищен от порчи!!!");
            throw new RuntimeException(e);
        }
        list.forEach(v -> {
            try {
                Files.write(Path.of(path), (v + "\n")
                        .getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
