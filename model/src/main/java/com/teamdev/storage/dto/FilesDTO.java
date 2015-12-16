package com.teamdev.storage.dto;


import java.util.Date;

public class FilesDTO {
    public final long id;
    public final String fileName;
    public final String fileLocation;
    public final long size;
    public final Date creationDate;
    public final FileType fileType;

    public FilesDTO(long id, String fileName, String fileLocation, long size, Date creationDate, FileType fileType) {
        this.id = id;
        this.fileName = fileName;
        this.fileLocation = fileLocation;
        this.size = size;
        this.creationDate = creationDate;
        this.fileType = fileType;
    }
}
