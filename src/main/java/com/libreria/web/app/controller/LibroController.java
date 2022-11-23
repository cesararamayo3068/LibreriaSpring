package com.libreria.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	

}
