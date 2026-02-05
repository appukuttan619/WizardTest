package org.example.core;

import java.nio.file.*;

public class FileSystemService {

    public void createDir(String path) throws Exception {
        Path p = Path.of(path);
        if (Files.exists(p)) {
            throw new IllegalStateException("Directory already exists");
        }
        Files.createDirectories(p);
    }

    public void deleteDir(String path) throws Exception {
        Path p = Path.of(path);
        if (!Files.exists(p)) {
            throw new IllegalStateException("Directory does not exist");
        }
        Files.delete(p);
    }

    public boolean exists(String path) {
        return Files.exists(Path.of(path));
    }

    public String currentDir() {
        return System.getProperty("user.dir");
    }
}