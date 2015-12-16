package com.teamdev.storage.services;

import com.teamdev.storage.dto.UserAccountDTO;

public interface UserService {

    void registerUser(String password, UserAccountDTO account);

    void readUserAccount(String token, long id);

    void updateUserAccount(String token, UserAccountDTO account);

}
