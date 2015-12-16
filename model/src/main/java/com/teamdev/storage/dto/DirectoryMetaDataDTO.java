package com.teamdev.storage.dto;


import java.util.Date;

public class DirectoryMetaDataDTO {
    public final long id;
    public final String directoryName;
    public final String directoryLocation;
    public final long size;
    public final long elements;
    public final Date creationDate;

    public DirectoryMetaDataDTO(long id, String directoryName, String directoryLocation, long size, long elements, Date creationDate) {
        this.id = id;
        this.directoryName = directoryName;
        this.directoryLocation = directoryLocation;
        this.size = size;
        this.elements = elements;
        this.creationDate = creationDate;
    }
}
