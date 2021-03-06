package com.viiup.web.flock.providers.interfaces;

import com.viiup.web.flock.models.*;

import java.util.List;

/**
 * Created by AbdullahMoyeen on 1/25/2016.
 */
public interface IUserProvider {

    UserModel insertUser(UserModel user);
    UserRoleModel insertUserRole(UserRoleModel userRole);
    UserModel getUserByEmailAddress(String emailAddress);
    List<UserRoleModel> getUserRolesByUserId(int userId);
    UserModel getUserByUserId(int userId);
    UserModel getAuthenticatedUser(String emailAddress, String password);
    void updateUserPassword(UserPasswordChangeModel userPassword);
    void updateUserPassword(UserPasswordChangeModel userPassword, boolean expirePassword);
}
