package com.isai.api_resfull_ejemplo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.isai.api_resfull_ejemplo.entity.Local;

public interface LocalRepository
        extends JpaRepository<Local, Long> {

    @Query("SELECT l FROM Local l WHERE l.name = :name")
    Optional<Local> findLocalByNameWithJPQL(String name);

    Optional<Local> findByName(String name);

    Optional<Local> findByNameIgnoreCase(String name);
}
