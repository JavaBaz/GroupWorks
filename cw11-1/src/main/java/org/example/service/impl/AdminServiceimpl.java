package org.example.service.impl;


import org.example.base.service.BaseService;
import org.example.base.service.impl.BaseServiceImpl;
import org.example.entity.Admin;
import org.example.repository.AdminRepository;
import org.example.service.AdminService;

public class AdminServiceimpl  extends BaseServiceImpl<Integer, Admin, AdminRepository>
        implements AdminService, BaseService<Integer, Admin> {


    public AdminServiceimpl(AdminRepository repository) {
        super(repository);
    }
}
