package org.example.repository.impl;

import org.example.base.repository.impl.BaseRepositoryImpl;
import org.example.config.MyConnection;
import org.example.entity.Admin;
import org.example.entity.User;
import org.example.repository.AdminRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminRepositoryImpl
        extends BaseRepositoryImpl<Integer, Admin>
        implements AdminRepository {
    @Override
    public String getTableName() {
        return "admin_table";
    }

    @Override
    public String getColumnsName() {
        return "(username, password)";
    }

    @Override
    public String getUpdateQueryParams() {
        return "username=?, password=?";
    }

    @Override
    public String getCountOfQuestionMarks() {
        return "?,?";
    }

    @Override
    public Admin mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        return new Admin(resultSet.getInt("id"),
                       resultSet.getString(2),
                       resultSet.getString(3));
    }

    @Override
    public void fillParamForStatement(PreparedStatement preparedStatement, Admin entity) throws SQLException {

        preparedStatement.setString(1,entity.getUsername());
        preparedStatement.setString(2,entity.getPassword());
    }

    @Override
    public Admin findUserByUsername(String userName) throws SQLException {
        String sql = "SELECT * FROM "+ getTableName() + " WHERE username = ? ";
        try(PreparedStatement preparedStatement = new MyConnection().getConnection().prepareStatement(sql)){
            preparedStatement.setString(1, userName);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
                return new Admin(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3));

        }
        return null;
    }
}
