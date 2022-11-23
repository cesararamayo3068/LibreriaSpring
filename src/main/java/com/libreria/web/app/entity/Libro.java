package com.libreria.web.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "libros")
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column (name = "titulo" ,nullable = false)
	private String titulo;
	@Column (name = "autor" ,nullable = false)
	private String autor;
	@Column (name = "precio" ,nullable = false)
	private Integer precio;
	@Column (name = "fecha_lanzamiento" ,nullable = false)
	private String fechaLanzamiento;
	
	public Libro() {
		
	}

	public Libro(Long id, String titulo, String autor, Integer precio, String fechaLanzamiento) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.fechaLanzamiento = fechaLanzamiento;
	}
	
	public Libro(String titulo, String autor, Integer precio, String fechaLanzamiento) {
		super();
        this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public String getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(String fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	@Override
	public String toString() {
		return "Libro [id= " + id + ", titulo =" + titulo + ", autor =" + autor + ", precio =" + precio
				+ ", fechaLanzamiento =" + fechaLanzamiento + "]";
	}
	
	
	

}
