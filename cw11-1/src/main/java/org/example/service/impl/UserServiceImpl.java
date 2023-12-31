package org.example.service.impl;

import org.example.base.service.impl.BaseServiceImpl;
import org.example.entity.User;
import org.example.exception.BadCredentialException;
import org.example.exception.UserNotFoundException;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.example.util.Constant;

public class UserServiceImpl
        extends BaseServiceImpl<Integer, User, UserRepository>
        implements UserService {
    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }

    @Override
    public boolean isExistUsername(String userName) throws Exception {
        return repository.isExistUsername(userName);
    }



    @Override
    public User checkCredentialInfoForLogin(String userName, String passWord) throws Exception {
        User resultSet = repository.findUserByUsername(userName);
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
