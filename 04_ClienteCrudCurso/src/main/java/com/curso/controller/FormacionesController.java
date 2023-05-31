package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Curso;
import com.curso.model.Formacion;
import com.curso.service.FormacionesService;

@RestController
public class FormacionesController {
	@Autowired
	FormacionesService service;
	@GetMapping(value="formacion")
	public List<Formacion> listadoFormacion(){
		return service.listaCursos();
	}
	@PostMapping(value="formacion/curso")
	public void altaCurso() {
		Curso curso=new Curso(9,"Kotlin",130);
		service.altaCurso(curso);
	}
}
