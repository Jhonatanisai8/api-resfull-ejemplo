package com.isai.api_resfull_ejemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isai.api_resfull_ejemplo.entity.Local;

public interface LocalRepository 
 extends JpaRepository<Local,Long> {
    
}
