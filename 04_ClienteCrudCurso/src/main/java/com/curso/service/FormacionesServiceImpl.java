package com.curso.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.model.Curso;
import com.curso.model.Formacion;

@Service
public class FormacionesServiceImpl implements FormacionesService {
	@Autowired
	RestTemplate template;
	private String url="http://localhost:8080/";
	List<Formacion> formaciones=new ArrayList<>();
	
	@Override
	public List<Formacion> listaCursos() {
		for(Curso curso:Arrays.asList(template.getForObject(url+"cursos", Curso[].class))) {
			if(curso.getDuracion()>=50) {
				formaciones.add(new Formacion(curso.getNombre(),10,curso.getPrecio()));
			}else {
				formaciones.add(new Formacion(curso.getNombre(),5,curso.getPrecio()));
			}
		}
		return formaciones;
	}

	@Override
	public void altaCurso(Curso curso) {
		for(Formacion forma:formaciones) {
			if(!forma.getCurso().equals(curso.getNombre())) {
				curso.setDuracion(forma.getAsignaturas()*10);
				template.postForLocation(url+"curso", curso);
			}
		}
	}

}
