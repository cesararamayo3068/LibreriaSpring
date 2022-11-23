package com.libreria.web.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libreria.web.app.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository <Libro,Long> {

}
