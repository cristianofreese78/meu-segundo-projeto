package com.example.meusegundoprojeto;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.meusegundoprojeto.entidades.Categoria;
import com.example.meusegundoprojeto.entidades.Filmes;
import com.example.meusegundoprojeto.repositories.CategoriaRepository;
import com.example.meusegundoprojeto.repositories.FilmesRepository;


@SpringBootApplication
public class MeuSegundoProjetoApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private FilmesRepository FilmesRepository;
	
	public static void main(String[] args) {
		
		
		SpringApplication.run(MeuSegundoProjetoApplication.class, args);
	
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria c1 = new  Categoria(null,"Suspense");
		Categoria c2 = new  Categoria(null,"Comédia");
		Categoria c3 = new  Categoria(null,"Drama");
		Categoria c4 = new  Categoria(null,"Ficcao");
		

		Filmes f1 = new Filmes(null,"O melhor jogo da história",2005,"Bill Paxton",c3);
		Filmes f2 = new Filmes(null,"Jamaica abaixo de Zero",1993,"Jon Turteltaub",c2);
		Filmes f3 = new Filmes(null,"O anjo malvado",1993,"Joseph Ruben",c1);
		Filmes f4 = new Filmes(null,"Avatar: O Caminho da Água",2022,"James Cameron",c4);
		
		
		c1.getFilmes().add(f3);
		c2.getFilmes().add(f2);
		c3.getFilmes().add(f1);
		c4.getFilmes().add(f4);
		
		categoriaRepository.save(c1);
		categoriaRepository.save(c2);
		categoriaRepository.save(c3);
		categoriaRepository.save(c4);
		
		FilmesRepository.save(f1);
		FilmesRepository.save(f2);
		FilmesRepository.save(f3);
		FilmesRepository.save(f4);
	
	}


	
}
