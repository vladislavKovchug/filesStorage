package com.teamdev.storage.services;

import com.teamdev.storage.dto.UploadFileDTO;

import java.util.List;

public interface FilesService {

    void downloadFile(String token, String path);

    void uploadFile(String token, UploadFileDTO file);
    void uploadFiles(String token, List<UploadFileDTO> files);

    void deleteFile(String token, String path);

    void deleteFiles(String token, List<String> filesPath);

    void deleteFilePermanently(String token, String path);

    void deleteFilesPermanently(String token, List<String> filesPath);

    void moveFile(String token, String filePath, String destinationDirectoryPath);

    void moveFiles(String token, List<String> filesPath, String destinationDirectoryPath);

    void copyFile(String token, String filePath, String destinationDirectoryPath);

    void copyFiles(String token, List<String> filesPath, String destinationDirectoryPath);

}
