package com.example.meusegundoprojeto.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.meusegundoprojeto.entidades.Filmes;
import com.example.meusegundoprojeto.repositories.FilmesRepository;

@RestController
@RequestMapping(value = "/filmes")
public class FilmesResource {

	@Autowired
	private FilmesRepository FilmesRepository;
	
	@GetMapping
	public ResponseEntity<List<Filmes>>  findAll(){
	
		List<Filmes> list = FilmesRepository.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Filmes>  findById(@PathVariable Long id){
		
		Filmes Filmes =  FilmesRepository.findById(id).get();
		
		return ResponseEntity.ok().body(Filmes);
		
	}
	
}
