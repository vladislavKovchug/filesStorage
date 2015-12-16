package com.teamdev.storage.dto;


public class UploadFileDTO {
    public final String location;
    public final String fileName;
    public final long fileSize;

    public UploadFileDTO(String location, String fileName, long fileSize) {
        this.location = location;
        this.fileName = fileName;
        this.fileSize = fileSize;
    }
}
