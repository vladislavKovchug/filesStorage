package com.teamdev.storage.services;

import com.teamdev.storage.dto.DirectoryMetaDataDTO;
import com.teamdev.storage.dto.FilesDTO;

import java.util.List;

public interface DeletedFilesReader extends FilesReaderTemplate {
    @Override
    List<FilesDTO> readFilesList(String token, String sourceDirectoryPath);

    @Override
    FilesDTO readFileInfo(String token, String filePath);

    @Override
    DirectoryMetaDataDTO readDirectoryInfo(String token, String directoryPath);
}
