package com.libreria.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.libreria.web.app.entity.Libro;
import com.libreria.web.app.service.LibroService;

@Controller
public class LibroController {
	
	@Autowired
	private LibroService libroService;
	
	@GetMapping ({"/libros","/"})
	public String listarLibros(Model model) {
		model.addAttribute("libros", libroService.listarLibros()); 
		return "libros";
	}
	
	@GetMapping ("/libros/nuevo")
	public String mostrarFormularioCrearLibro(Model model) {
		Libro libro = new Libro();
		model.addAttribute("libro", libro);
		return "crear_libro";
	}
	
   @PostMapping("/libros")
   public String guardarLibro(@ModelAttribute("libro") Libro libro) {
	   libroService.guardarLibro(libro);
	   return "redirect:/libros";
   }
}
