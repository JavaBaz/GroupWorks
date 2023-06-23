package org.example.service.impl;

import org.example.base.service.BaseService;
import org.example.base.service.impl.BaseServiceImpl;
import org.example.entity.Order;
import org.example.repository.OrderRepository;
import org.example.service.OrderService;

import java.sql.SQLException;

public class OrderServiceImpl
        extends BaseServiceImpl<Integer, Order, OrderRepository>
        implements OrderService, BaseService<Integer, Order> {

    public OrderServiceImpl(OrderRepository repository) {
        super(repository);
    }



    @Override
    public void save(Order order) throws SQLException {
        repository.save(order);
    }

    @Override
    public void delete(Integer orderID) throws SQLException {
        repository.delete(orderID);
    }

    @Override
    public Order findById(Integer orderID) throws SQLException {
        return repository.findById(orderID);
    }

    @Override
    public void update(Order orderId) throws SQLException {
        repository.update(orderId);
    }



}
