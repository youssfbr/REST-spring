package com.github.youssfbr.auth.services;

import com.github.youssfbr.auth.entities.Role;
import com.github.youssfbr.auth.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository repository;

    public Role save(Role role) {
        return repository.save(role);
    }

    public Role findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Role> findAll() {
        return repository.findAll();
    }

}
