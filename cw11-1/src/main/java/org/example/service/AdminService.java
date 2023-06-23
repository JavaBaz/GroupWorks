package org.example.service;

import org.example.base.service.BaseService;
import org.example.entity.Admin;

public interface AdminService extends BaseService<Integer , Admin> {
    Admin checkCredentialInfoForLogin(String userName, String passWord) throws Exception;

}
