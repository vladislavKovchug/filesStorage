package com.teamdev.storage.services;

import com.teamdev.storage.dto.DirectoryMetaDataDTO;
import com.teamdev.storage.dto.FilesDTO;

import java.util.List;

public interface FilesReaderTemplate {
    List<FilesDTO> readFilesList(String token, String sourceDirectoryPath);

    FilesDTO readFileInfo(String token, String filePath);

    DirectoryMetaDataDTO readDirectoryInfo(String token, String directoryPath);
}
