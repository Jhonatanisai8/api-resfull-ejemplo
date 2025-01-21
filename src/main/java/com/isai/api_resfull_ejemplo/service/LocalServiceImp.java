package com.isai.api_resfull_ejemplo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.isai.api_resfull_ejemplo.entity.Local;
import com.isai.api_resfull_ejemplo.repository.LocalRepository;

import java.util.List;

@Service
public class LocalServiceImp
        implements LocalService {

    @Autowired
    LocalRepository repository;

    @Override
    public List<Local> findAllLocals() {
        return repository.findAll();
    }
}
