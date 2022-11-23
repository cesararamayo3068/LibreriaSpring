package com.libreria.web.app.service;

import java.util.List;

import com.libreria.web.app.entity.Libro;

public interface LibroService {
	
	public List<Libro>listarLibros();
	
	public Libro guardarLibro(Libro libro);
	
	public Libro obtenerLibroPorId(Long id);
	
	public Libro actualizarLibro(Libro libro);
	
	public void eliminarLibroPorId(Long id);

}
