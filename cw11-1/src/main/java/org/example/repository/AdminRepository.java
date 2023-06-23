package org.example.repository;

import org.example.base.repository.BaseRepository;
import org.example.entity.Admin;
import org.example.entity.User;

import java.sql.SQLException;

public interface AdminRepository extends BaseRepository<Integer, Admin> {


    Admin findUserByUsername(String userName) throws SQLException;

}
