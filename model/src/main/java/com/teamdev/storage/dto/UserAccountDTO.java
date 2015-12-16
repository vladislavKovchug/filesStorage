package com.teamdev.storage.dto;

import java.util.Date;

public class UserAccountDTO {

    public final long id;
    public final String nickName;
    public final String mail;
    public final long age;
    public final Date birthday;

    public UserAccountDTO(long id, String nickName, String mail, long age, Date birthday) {
        this.id = id;
        this.nickName = nickName;
        this.mail = mail;
        this.age = age;
        this.birthday = birthday;
    }
}
