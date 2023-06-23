package org.example.util;

import org.example.config.MyConnection;
import org.example.repository.AdminRepository;
import org.example.repository.UserRepository;
import org.example.repository.impl.AdminRepositoryImpl;
import org.example.repository.impl.UserRepositoryImpl;
import org.example.service.AdminService;
import org.example.service.UserService;
import org.example.service.impl.AdminServiceimpl;
import org.example.service.impl.UserServiceImpl;

import java.sql.Connection;

public class ApplicationContext {

    private static UserRepository userRepository;
    private static UserService userService;

    static {
        userRepository = new UserRepositoryImpl();
        userService = new UserServiceImpl(userRepository);
    }


    //------------------ Admin usages ------------------

    private static AdminRepository adminRepository;
    private static AdminService adminService;


    static {
        adminRepository = new AdminRepositoryImpl();
        adminService = new AdminServiceimpl(adminRepository);
    }

    public static UserService getUserService() {
        return userService;
    }

    public static AdminService getAdminService() {
        return adminService;
    }
}
