package org.example.repository;

import org.example.base.repository.BaseRepository;
import org.example.entity.Order;
import org.example.exception.UserIdExistException;

import java.sql.SQLException;

public interface OrderRepository extends BaseRepository<Integer, Order> {

}
