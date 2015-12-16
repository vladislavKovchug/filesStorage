package com.teamdev.storage.services;


import java.util.List;

public interface DeletedFilesService {

    void deleteFile(String token, String path);
    void deleteFiles(String token, List<String> filesPath);

    void restoreFile(String token, String path);
    void restoreFiles(String token, List<String> filesPath);

    void deleteDirectory(String token, String path, boolean recursively);
    void deleteDirectories(String token, List<String> directoriesPath, boolean recursively);

    void restoreDirectory(String token, String path, boolean recursively);
    void restoreDirectories(String token, List<String> directoriesPath, boolean recursively);

}
