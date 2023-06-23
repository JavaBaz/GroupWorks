package org.example.service.impl;


import org.example.base.service.BaseService;
import org.example.base.service.impl.BaseServiceImpl;
import org.example.entity.Admin;
import org.example.entity.User;
import org.example.exception.BadCredentialException;
import org.example.exception.UserNotFoundException;
import org.example.repository.AdminRepository;
import org.example.service.AdminService;
import org.example.util.Constant;

public class AdminServiceimpl  extends BaseServiceImpl<Integer, Admin, AdminRepository>
        implements AdminService, BaseService<Integer, Admin> {


    public AdminServiceimpl(AdminRepository repository) {
        super(repository);
    }



    @Override
    public Admin checkCredentialInfoForLogin(String userName, String passWord) throws Exception {
        Admin resultSet = repository.findUserByUsername(userName);
        if (resultSet != null){
            if (userName.equals(resultSet.getUsername()) &&
                    passWord.equals(resultSet.getPassword()))
                return resultSet;
            else
                throw new BadCredentialException(Constant.BAD_CREDENTIAL);
        }
        throw new UserNotFoundException(Constant.USER_NOT_FOUND);
    }
}
