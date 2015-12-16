package com.teamdev.storage.services;

import java.util.List;

public interface DirectoriesService {
    void createDirectory(String token, String path);

    void deleteDirectory(String token, String path, boolean recursively);

    void deleteDirectories(String token, List<String> directoriesPath, boolean recursively);

    void deleteDirectoryPermanently(String token, String path, boolean recursively);

    void deleteDirectoriesPermanently(String token, List<String> directoriesPath, boolean recursively);

    void moveDirectory(String token, String sourcePath, String destinationDirectoryPath, boolean recursively);

    void moveDirectories(String token, List<String> directoriesPath, String destinationDirectoryPath, boolean recursively);

    void copyDirectory(String token, String sourcePath, String destinationDirectoryPath, boolean recursively);

    void copyDirectories(String token, List<String> directoriesPath, String destinationDirectoryPath, boolean recursively);

}
