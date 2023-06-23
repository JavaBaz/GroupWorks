package org.example.service.impl;


import org.example.base.service.BaseService;
import org.example.base.service.impl.BaseServiceImpl;
import org.example.entity.Fruit;
import org.example.repository.FruitRepository;
import org.example.service.FruitService;

import java.sql.SQLException;

public class FruitServiceImpl
        extends BaseServiceImpl<Integer, Fruit, FruitRepository>
        implements FruitService, BaseService<Integer, Fruit> {


    public FruitServiceImpl(FruitRepository repository) {
        super(repository);
    }


    @Override
    public void delete(Integer integer) throws SQLException {
        repository.delete(integer);
    }

    @Override
    public Fruit findById(Integer integer) throws SQLException {
        return repository.findById(integer);
    }

    @Override
    public void update(Fruit entity) throws SQLException {
        repository.update(entity);
    }
}
