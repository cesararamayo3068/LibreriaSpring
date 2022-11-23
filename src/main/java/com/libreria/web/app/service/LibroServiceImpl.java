package com.libreria.web.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.web.app.entity.Libro;
import com.libreria.web.app.repository.LibroRepository;


@Service
public class LibroServiceImpl implements LibroService{
	
	@Autowired
	private LibroRepository libroRepository;

	@Override
	public List<Libro> listarLibros() {
		return libroRepository.findAll();
	}

	@Override
	public Libro guardarLibro(Libro libro) {
		
		return libroRepository.save(libro);
	}

}
