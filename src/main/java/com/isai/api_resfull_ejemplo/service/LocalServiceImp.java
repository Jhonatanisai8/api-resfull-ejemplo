package com.isai.api_resfull_ejemplo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.isai.api_resfull_ejemplo.entity.Local;
import com.isai.api_resfull_ejemplo.repository.LocalRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class LocalServiceImp
        implements LocalService {

    @Autowired
    LocalRepository repository;

    @Override
    public List<Local> findAllLocals() {
        return repository.findAll();
    }

    @Override
    public Local saveLocal(Local local) {
        return repository.save(local);
    }

    @Override
    public Local updateLocal(Long localID, Local local) {
        Local localSe = repository
                .findById(localID)
                .get();
        if (Objects.nonNull(local.getCode()) &&
                !"".equalsIgnoreCase(local.getCode())) {
            localSe.setCode(local.getCode());
        }

        if (Objects.nonNull(local.getName()) &&
                !"".equalsIgnoreCase(local.getName())) {
            localSe.setName(local.getName());
        }

        if (Objects.nonNull(local.getFloor()) &&
                !"".equalsIgnoreCase(local.getFloor())) {
            localSe.setFloor(local.getFloor());
        }

        return repository.save(localSe);
    }

    @Override
    public void deleteLocal(Long localID) {
        repository.deleteById(localID);
    }

    @Override
    public Optional<Local> findLocalByNameWithJPQL(String name) {
        return repository.findLocalByNameWithJPQL(name);
    }

    @Override
    public Optional<Local> findByName(String name) {
        return repository.findByName(name);
    }
}
