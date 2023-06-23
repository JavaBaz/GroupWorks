package org.example.repository;

import org.example.base.repository.BaseRepository;
import org.example.entity.User;
import org.example.exception.UsernameExistException;

import java.sql.SQLException;

public interface UserRepository extends BaseRepository<Integer, User> {

    boolean isExistUsername(String userName) throws SQLException, UsernameExistException;



    User findUserByUsername(String userName) throws SQLException;
}
