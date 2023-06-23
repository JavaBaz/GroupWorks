package org.example.service;


import org.example.base.service.BaseService;
import org.example.entity.User;

public interface UserService extends BaseService<Integer, User> {


    boolean isExistUsername(String userName) throws Exception;


    User checkCredentialInfoForLogin(String userName, String passWord) throws Exception;
}
