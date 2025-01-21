package com.isai.api_resfull_ejemplo.service;

import java.util.List;

import com.isai.api_resfull_ejemplo.entity.Local;

public interface LocalService {
    List<Local> findAllLocals();

    Local saveLocal(Local local);

    Local updateLocal(Long localID,Local local);

    void deleteLocal(Long localID);
}