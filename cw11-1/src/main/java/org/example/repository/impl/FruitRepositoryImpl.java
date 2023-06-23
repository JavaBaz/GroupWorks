package org.example.repository.impl;

import org.example.base.repository.impl.BaseRepositoryImpl;
import org.example.entity.Fruit;
import org.example.repository.FruitRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FruitRepositoryImpl
        extends BaseRepositoryImpl<Integer, Fruit>
        implements FruitRepository {
    @Override
    public String getTableName() {
        return "fruit_table";
    }

    @Override
    public String getColumnsName() {
        return "(id ,name ,description ,existence ,inventory ,price)";
    }

    @Override
    public String getUpdateQueryParams() {
        return "name=? ,description=? ,existence=? ,inventory=? ,price=?";
    }

    @Override
    public String getCountOfQuestionMarks() {
        return "?,?,?,?,?";
    }

    @Override
    public Fruit mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        return new Fruit(resultSet.getInt(1),
                resultSet.getString(2),
                resultSet.getString(3),
                resultSet.getBoolean(4),
                resultSet.getInt(5),
                   resultSet.getInt(6));
    }

    @Override
    public void fillParamForStatement(PreparedStatement preparedStatement, Fruit entity) throws SQLException {
        preparedStatement.setString(1, entity.getName());
        preparedStatement.setString(2, entity.getDescription());
        preparedStatement.setBoolean(3, entity.isExistence());
        preparedStatement.setInt(4, entity.getInventory());
        preparedStatement.setInt(5, entity.getPrice());
    }

}
