package org.example.repository.impl;

import org.example.base.repository.impl.BaseRepositoryImpl;
import org.example.config.MyConnection;
import org.example.entity.User;
import org.example.exception.UsernameExistException;
import org.example.repository.UserRepository;
import org.example.util.Constant;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepositoryImpl
        extends BaseRepositoryImpl<Integer, User>
        implements UserRepository {

    @Override
    public String getTableName() {
        return "users";
    }

    @Override
    public String getColumnsName() {
        return "(name, username, password)";
    }

    @Override
    public String getUpdateQueryParams() {
        return "name = ? , username = ?, password = ?";
    }

    @Override
    public String getCountOfQuestionMarks() {
        return "?,?,?";
    }

    @Override
    public User mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        return new User(resultSet.getInt(1),
                resultSet.getString(2),
                resultSet.getString(3),
                resultSet.getString(4));
    }

    @Override
    public void fillParamForStatement(PreparedStatement preparedStatement, User entity) throws SQLException {
        preparedStatement.setString(1, entity.getName());
        preparedStatement.setString(2, entity.getUsername());
        preparedStatement.setString(3, entity.getPassword());
    }

    @Override
    public boolean isExistUsername(String userName) throws SQLException, UsernameExistException {
        String sql = "SELECT username FROM " + getTableName() + " WHERE username = ?";
        try (PreparedStatement preparedStatement = new MyConnection().getConnection().prepareStatement(sql)){
            preparedStatement.setString(1, userName);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
                throw new UsernameExistException(Constant.USER_EXIST);
        }
        return false;
    }



    public User findUserByUsername(String userName) throws SQLException{
        String sql = "SELECT * FROM "+ getTableName() + " WHERE username = ? ";
        try(PreparedStatement preparedStatement = new MyConnection().getConnection().prepareStatement(sql)){
            preparedStatement.setString(1, userName);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
                return new User(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4)
                );
        }
        return null;
    }

}
