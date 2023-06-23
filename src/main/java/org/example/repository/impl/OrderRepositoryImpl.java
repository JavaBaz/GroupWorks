package org.example.repository.impl;

import org.example.base.repository.impl.BaseRepositoryImpl;

import org.example.entity.Order;
import org.example.entity.Status;
import org.example.repository.OrderRepository;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderRepositoryImpl
        extends BaseRepositoryImpl<Integer, Order>
        implements OrderRepository {

    @Override
    public String getTableName() {
        return "order_table";
    }

    @Override
    public String getColumnsName() {
        return "(userid, date)";
    }

    @Override
    public String getUpdateQueryParams() {
        return "userid = ? , date = ?";
    }

    @Override
    public String getCountOfQuestionMarks() {
        return "?, ?";
    }
    public Status varcharToStatus(ResultSet resultSet ) throws SQLException {
        String enumValue = resultSet.getString("status");
        Status status = switch (enumValue) {
            case "SENT" -> Status.SENT;
            case "CANCELED" -> Status.CANCELED;
            case "WAITING_FOR_PAYMENT" -> Status.WAITING_FOR_PAYMENT;
            case "IN_REPOSITORY" -> Status.IN_REPOSITORY;
            default -> null;
        };
        return status;
    }
    @Override
    public Order mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        return new Order(resultSet.getInt("id"),
                resultSet.getInt("user_id"),
                resultSet.getInt("fruit_id"),
                varcharToStatus(resultSet),
                resultSet.getInt("amount"));
    }

    @Override
    public void fillParamForStatement(PreparedStatement preparedStatement, Order entity) throws SQLException {
        preparedStatement.setInt(1,entity.getUserId());
        preparedStatement.setInt(2,entity.getFruitId());
        preparedStatement.setString(3,entity.getStatus().toString());
        preparedStatement.setInt(4,entity.getAmount());
    }

}
