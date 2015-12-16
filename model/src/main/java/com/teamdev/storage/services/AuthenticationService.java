package com.teamdev.storage.services;

public interface AuthenticationService {

    String login(String mail, String password);

    void logout(String token);

    boolean checkUserAuthorized(String token);

}
